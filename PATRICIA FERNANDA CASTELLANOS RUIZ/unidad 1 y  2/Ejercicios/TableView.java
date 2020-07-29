package ejercicios30;

import java.awt.FlowLayout;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableView 
{
    public static void main(String[]args)
    {
        JFrame f = new JFrame();
        f.setTitle("JTableTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        Object[][] datos =
        {
            {"Luis","Macías", new Integer(911234567)},
            {"María","Nieto", new Integer(917463527)},
            {"Karla","Gonzalez", new Integer(912494735)},
            {"Alondra","Pérez", new Integer(912387448)},
        };
        String[] columnas = {"Nombre","Apellidos","Tel"};
        JTable t=new JTable(datos, columnas);
        JScrollPane sp = new JScrollPane(t);
        f.getContentPane().add(sp);
        f.setVisible(true);
    }
    
}
