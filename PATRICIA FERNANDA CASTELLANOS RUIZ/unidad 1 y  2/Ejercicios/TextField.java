package ejercicios30;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField
{ 
     public static void main(String[]args)
     {
         JFrame f = new JFrame();
         f.setTitle("JTextFieldTest");
         f.setSize(200,150);
         f.getContentPane().setLayout(new FlowLayout());
         JTextField tf = new JTextField("Escribe aqui..");
         f.getContentPane().add(tf);
         f.setVisible(true);
     }

    void setPromptText(String enter_the_total) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void setPrefColumnCount(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
