package Unidad2.proyecto;
import javax.swing.*;

/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion
{
     public static void main(String[] args)

   {

       ArbolHebrado arbol = new ArbolHebrado();

       for(int i = 0; i<11; i++)

       {

           int num= Integer .parseInt(JOptionPane.showInputDialog(null, "NUMERO"));

           arbol.creaArbolBinario(num);

       }

       System.out.println("\n Salida en entreoOrden:");

       arbol.entreOrden();

   }

}
    