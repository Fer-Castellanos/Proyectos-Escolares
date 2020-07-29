package ejercicios30;

import java.awt.*;

public class CheckBoxTest extends java.applet.Applet
{
  public void init() 
  {
    setLayout(new FlowLayout(FlowLayout.LEFT));
    add(new Checkbox("Pizza"));
    add(new Checkbox("Sándwich"));
    add(new Checkbox("Cereal"));
    add(new Checkbox("Chocolate", null, true));
    add(new Checkbox("Jugo"));
  }
}