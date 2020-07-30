package Unidad2.Proyecto4;

import javax.swing.JOptionPane;
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion
{
    public static void main (String[] args)

 {

    ArbolDigital arbol=new ArbolDigital();

    int opcion=0;

    do{

    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\n" +

    "1. Ingresar Llave\n" +"2. Salir\n" + "Opcion:" ));

 

    switch(opcion)

    {

        case 1: String key = JOptionPane.showInputDialog(null, "Llave: ");

        //Validar que solo sean digitos

        if (key.matches("[0-9]*"))

        { //Coloca cada digito en el árbol de busqueda digital

            JOptionPane.showMessageDialog(null, arbol.search(key));

        }

        else

        {

            JOptionPane.showMessageDialog(null, "Solo digitos en la Llave!!");

        }

        break;

       
    }

  }

    while (opcion != 2);
 }
}