package ejercicios30;

import java.awt.FlowLayout;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToggleButton;


public class ToogleButton 
{
     public static void main(String[]args)
     {
         JFrame f = new JFrame();
         f.setTitle("ToggleButtonTest");
         f.setSize(200,150);
         f.getContentPane().setLayout(new FlowLayout());
         ButtonGroup bg = new ButtonGroup();
         JToggleButton b1 = new JToggleButton("Masculino",true);
         bg.add(b1);
         JToggleButton b2 = new JToggleButton("Femenino",false);
         bg.add(b2);
         f.getContentPane().add(b1);
         f.getContentPane().add(b2);
         f.setVisible(true);
     }
}
