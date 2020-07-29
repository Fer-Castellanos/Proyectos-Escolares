package ejercicios30;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class JMenuBarTest
{ 
     public static void main(String[]args)
     {
         JFrame f = new JFrame("JMenuBarTest");
         f.setSize(200,150);
         JMenuBar mb=new JMenuBar();
         JMenu m1 = new JMenu("Menu 1");
         m1.add(new JMenuItem("Opcion 1"));
         m1.add(new JMenuItem("Opcion 2"));
         JMenu m2 = new JMenu("Menu 2");
         m2.add(new JCheckBoxMenuItem("Opcion 1"));
         m2.add(new JCheckBoxMenuItem("Opcion 2"));
         m2.addSeparator();
         m2.add(new JRadioButtonMenuItem("Opcion 3", true));
         mb.add(m1);
         mb.add(m2);
         f.setJMenuBar(mb);
         f.setVisible(true);
     }
}