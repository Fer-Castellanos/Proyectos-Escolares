package ejercicios30;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxTest 
{
    public static void main (String[]args)
    {
	JFrame f= new JFrame();
	f.setTitle("JJRadioButtonTest");
	f.setSize(200,150);
	f.getContentPane().setLayout(new FlowLayout());
	String[] list = {"Morado","Azul","Negro"};
	JComboBox c = new JComboBox(list);
	f.getContentPane().add(c);
	f.setVisible(true);
}
}
