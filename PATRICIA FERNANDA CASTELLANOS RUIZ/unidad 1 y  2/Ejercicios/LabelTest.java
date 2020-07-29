package ejercicios30;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;


public class LabelTest extends java.applet.Applet
{
    public void init()
    {
        setFont(new Font ("Helvetica", Font.BOLD, 14));
        setLayout(new GridLayout(3,1));
        add(new Label("Izquierda", Label.LEFT));
        add(new Label("Centro", Label.CENTER));
        add(new Label("Derecha", Label.RIGHT));
    }
}
