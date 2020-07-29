package ejercicios30;

import java.awt.FlowLayout;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JToolTipTest
{
    public static void main (String[]args)
    {
        JFrame f= new JFrame();
        f.setTitle("JToolTipTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        JButton b = new JButton("Ok");
        b.setToolTipText("Pulsar Ok");
        f.getContentPane().add(b);
        f.setVisible(true);
    }
}
    