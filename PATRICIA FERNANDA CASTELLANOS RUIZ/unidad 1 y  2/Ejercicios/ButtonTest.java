package ejercicios30;

import java.awt.Button;
import java.applet.Applet;

public class ButtonTest extends java.applet.Applet
{
    @Override
     public void init() 
    {
    add(new Button("1"));
    add(new Button("2"));
    add(new Button("3"));
    add(new Button("4"));
    }
}

