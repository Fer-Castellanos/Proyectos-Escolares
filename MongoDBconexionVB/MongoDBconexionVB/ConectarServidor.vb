Public Class ConectarServidor

    Public Shared Sub AbrirServidor()

        Dim fileReader As String
        fileReader = My.Computer.FileSystem.ReadAllText("servidor.txt")


        Dim Pross As Process = New Process
        Console.WriteLine("Iniciando el proceso")
        Console.ReadLine()
        Pross.StartInfo.FileName = fileReader
        Pross.Start()
        Console.ReadLine()
    End Sub

    Public Shared Sub BackupDataBase()

        Dim fileReader As String
        fileReader = My.Computer.FileSystem.ReadAllText("backup.txt")


        Dim Pross As Process = New Process
        Console.WriteLine("Iniciando el proceso")
        Console.ReadLine()

        Process.Start(fileReader, "--collection datospersonales --db agenda --out c:\data")

    End Sub

    Public Shared Sub RestoreDataBase()

        Dim fileReader As String
        fileReader = My.Computer.FileSystem.ReadAllText("restore.txt")


        Dim Pross As Process = New Process
        Console.WriteLine("Iniciando el proceso")
        Console.ReadLine()

        Process.Start(fileReader, "-d agenda c:\data\agenda")

    End Sub

End Class
