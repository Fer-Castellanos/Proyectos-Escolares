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
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeView 
{
    public static void main (String[]args)
    {
        JFrame f= new JFrame();
        f.setTitle("JTreeTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        DefaultMutableTreeNode titulo = new DefaultMutableTreeNode("Programacion en java");
        DefaultMutableTreeNode capitulo = new DefaultMutableTreeNode("AWT");
        titulo.add(capitulo);
        capitulo=new DefaultMutableTreeNode("JFC");
        titulo.add(capitulo);
        JTree tree = new JTree(titulo);
        JScrollPane sp = new JScrollPane(tree);
        f.getContentPane().add(sp);
        f.setVisible(true);
    }
}
