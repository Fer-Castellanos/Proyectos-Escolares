Imports MongoDB.Driver
Imports MongoDB.Bson
Imports System
Imports System.Text.RegularExpressions

Imports MongoDB.Driver.Builders
Imports MongoDB.Driver.GridFS
Imports MongoDB.Driver.Linq

Public Class ClienteForm
    Dim _NOMBRE As String

    Public Sub TomaFoco() Handles txtBuscar.GotFocus
        Dim txt As New TextBox
        txt.Text = txtBuscar.Text
        If txt.Text = "<-Escriba aqui para buscar->" Then
            txt.Text = ""
        End If
        txtBuscar.Text = txt.Text

    End Sub

    Private Async Sub ClienteForm_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Await BuscarTodo()

    End Sub


    Private Sub btnGuardar_Click(sender As Object, e As EventArgs) Handles btnGuardar.Click
        InsertaDatos()
    End Sub

    Private Async Sub InsertaDatos()
        Dim ConnectionString = "mongodb://localhost/"
        Dim client = New MongoClient(ConnectionString)
        Dim db = client.GetDatabase("agenda")

        Dim col = db.GetCollection(Of BsonDocument)("datospersonales")

        Dim doc = New BsonDocument
        doc.Add("NOMBRE", txtNombre.Text)
        doc.Add("TELEFONO", txtTelefono.Text)
        doc.Add("FECHA_NACIMIENTO", CDate(txtFecha.Text))


        Await col.InsertOneAsync(doc)

        Await BuscarTodo()

    End Sub

    Private Async Function BuscarTodo() As Task

        Dim ConnectionString = "mongodb://localhost/"
        Dim client = New MongoClient(ConnectionString)
        Dim db = client.GetDatabase("agenda")

        Dim col = db.GetCollection(Of BsonDocument)("datospersonales")

        Dim dtCliente As New DataTable("Cliente")
        dtCliente.Columns.Add("ID")
        dtCliente.Columns.Add("NOMBRE")
        dtCliente.Columns.Add("TELEFONO")
        dtCliente.Columns.Add("FECHA_NACIMIENTO")


        Dim dr As DataRow

        Using cursor = Await col.Find(New BsonDocument).ToCursorAsync
            While (Await cursor.MoveNextAsync())
                For Each doc In cursor.Current
                    dr = dtCliente.NewRow()
                    dr("ID") = doc("_id")
                    dr("NOMBRE") = doc("NOMBRE")
                    dr("TELEFONO") = doc("TELEFONO")
                    dr("FECHA_NACIMIENTO") = doc("FECHA_NACIMIENTO")
                    dtCliente.Rows.Add(dr)
                Next
            End While
        End Using

        Dim bs As New BindingSource
        bs.DataSource = dtCliente

        bs.Filter = "NOMBRE like '%" & txtBuscar.Text & "%'"

        DataGridView1.DataSource = bs

    End Function

    Private Async Sub btnEliminar_Click(sender As Object, e As EventArgs) Handles btnEliminar.Click
        Await Eliminar()
    End Sub

    Private Async Function Eliminar() As Task
        'Dim collection As IMongoCollection(Of BsonDocument) = db.GetCollection(Of BsonDocument)("datospersonales")

        Dim ConnectionString = "mongodb://localhost/"
        Dim client = New MongoClient(ConnectionString)
        Dim db = client.GetDatabase("agenda")

        Dim col = db.GetCollection(Of BsonDocument)("datospersonales")

        Dim result = Await col.FindOneAndDeleteAsync(Builders(Of BsonDocument).Filter.Eq(Of String)("NOMBRE", txtNombre.Text), New FindOneAndDeleteOptions(Of BsonDocument))

        Await BuscarTodo()

    End Function

    Private Sub btnActualizar_Click(sender As Object, e As EventArgs) Handles btnActualizar.Click
        ActualizarDatos()
    End Sub

    Private Async Sub ActualizarDatos()

        Dim ConnectionString = "mongodb://localhost/"
        Dim client = New MongoClient(ConnectionString)
        Dim db = client.GetDatabase("agenda")
        Dim col = db.GetCollection(Of BsonDocument)("datospersonales")

        'below code will update one record of the data


        Dim updoneresult = Await col.UpdateOneAsync(Builders(Of BsonDocument).Filter.Eq(Of String)("NOMBRE", _NOMBRE), Builders(Of BsonDocument).Update.Set(Of String)("TELEFONO", txtTelefono.Text))
        updoneresult = Await col.UpdateOneAsync(Builders(Of BsonDocument).Filter.Eq(Of String)("NOMBRE", _NOMBRE), Builders(Of BsonDocument).Update.Set(Of Date)("FECHA_NACIMIENTO", txtFecha.Text))
        updoneresult = Await col.UpdateOneAsync(Builders(Of BsonDocument).Filter.Eq(Of String)("NOMBRE", _NOMBRE), Builders(Of BsonDocument).Update.Set(Of String)("NOMBRE", txtNombre.Text))

        Await BuscarTodo()

    End Sub

    Private Sub btnNuevo_Click(sender As Object, e As EventArgs) Handles btnNuevo.Click
        txtID.Clear()
        txtNombre.Clear()
        txtTelefono.Clear()
        txtFecha.Clear()
        txtNombre.Focus()
    End Sub

    Private Async Sub txtBuscar_TextChanged(sender As Object, e As EventArgs) Handles txtBuscar.TextChanged
        Await BuscarTodo()
    End Sub


    Private Sub DataGridView1_CellEnter(sender As Object, e As DataGridViewCellEventArgs) Handles DataGridView1.CellEnter
        If DataGridView1.RowCount > 0 Then
            txtID.Text = DataGridView1.CurrentRow.Cells("ID").Value.ToString
            txtNombre.Text = DataGridView1.CurrentRow.Cells("NOMBRE").Value.ToString
            txtTelefono.Text = DataGridView1.CurrentRow.Cells("TELEFONO").Value.ToString
            txtFecha.Text = Format(CDate(DataGridView1.CurrentRow.Cells("FECHA_NACIMIENTO").Value), "dd/MM/yyyy")
            _NOMBRE = DataGridView1.CurrentRow.Cells("NOMBRE").Value.ToString
        Else
            txtID.Clear()
            txtNombre.Clear()
            txtTelefono.Clear()
            txtFecha.Clear()
            _NOMBRE = ""

        End If
    End Sub

End Class
