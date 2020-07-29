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
import javax.swing.JPasswordField;

public class JPasswordFieldTest
{ 
     public static void main(String[]args)
     {
         JFrame f = new JFrame();
         f.setTitle("JPasswordFieldTest");
         f.setSize(500,250);
         f.getContentPane().setLayout(new FlowLayout());
         JPasswordField pf = new JPasswordField("chemi");
         f.getContentPane().add(pf);
         f.setVisible(true);
     }
}


