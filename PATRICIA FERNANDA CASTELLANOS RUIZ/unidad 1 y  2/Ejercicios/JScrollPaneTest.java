package ejercicios30;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScrollPaneTest
{ 
     public static void main(String[]args)
     {
         JFrame f = new JFrame();
         f.setTitle("JScrollPaneTest");
         f.setSize(200,150);
         f.getContentPane().setLayout(new FlowLayout());
         JTextArea ta = new JTextArea("Escribe aqui..",5,5);
         JScrollPane p= new JScrollPane(ta);
         f.getContentPane().add(p);
         f.setVisible(true);
     }
}