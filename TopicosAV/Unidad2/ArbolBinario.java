package Unidad2;
import javax.swing.*;

/**
 * Write a description of class ArbolBinario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArbolBinario
{
    public static void main(String[]args)
    {
       Arbol arbol = new Arbol();
       
       for(int i=0;i<20; i++)
       {
         int n=Integer.parseInt(JOptionPane.showInputDialog(null,"numero:"));
         arbol.creaArbolBinario(n);
       }
       System.out.println("salida en entreorden:");
      arbol.entreOrden(arbol.getRaiz());
      

    }
}
