import java.util.Scanner;
import javax.swing.*;
/**
 * En esta clase haremos una tabla de multiplicar
 * 
 * @author patricia fernanda castellanos ruiz 
 * @version 1.0 07-junio-2016
 * 
 */
public class Contador2
{
    public static void main(String[]args)
      {
       
     int limite;
     limite =Integer.parseInt(JOptionPane.showInputDialog(null,"Que tabla de multiplicar quieres"));
     
     for(int contador=1; contador<=limite; contador ++){
          
          //contador*contador;
          
          System.out.println(JOptionPane.showInputDialog("¿Hasta que tabla quieres llegar?"));
          
          System.out.println("Hasta que tabla quieres multiplicar \n1 \n2 \n3 \n4 \n5 \n6 \n7 \n8 \n9. salir");
      }
    }
}
