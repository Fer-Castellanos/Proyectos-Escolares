package ejercicios30;

import java.awt.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class JColorChooserTest
{ 
     public static void main(String[]args)
     {
         JFrame f = new JFrame();
         f.setTitle("JColorChooserTest");
         f.setSize(200,150);
         f.setVisible(true);
         
         Color c= JColorChooser.showDialog(f,"Seleccione un color",Color.RED);
         System.out.println("El color seleccionado es: " + c);
     }
}