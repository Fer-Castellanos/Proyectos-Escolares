package ejercicios30;


import java.awt.*;

public class ChoiceBox extends java.applet.Applet
{
  public void init()
  {
    Choice c = new Choice();

    c.addItem("Manzanas");
    c.addItem("Naranjas");
    c.addItem("Bananas");
    c.addItem("Uvas");
    c.addItem("Fresas");

    add(c);
  }
}