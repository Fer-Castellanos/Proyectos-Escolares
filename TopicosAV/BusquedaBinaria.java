import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 * Write a description of class BusquedaBinaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BusquedaBinaria
{
    public static int busquedaBinaria(int x [],int n,int bajo,int alto)
   {
     int mitad;
     if(alto<bajo)
     {
     return-1; //caso base
     }
     else
     {
           mitad=((bajo+alto)/2);
           if(x[mitad]==n)
           return mitad;//retorna posicion de n
     }
           
    if(n<x[mitad])
     return busquedaBinaria(x,n,bajo,mitad-1);
           
    else
     return busquedaBinaria(x,n,mitad+1,alto);
   }
   
   public static void insercionSimple(int x[], int n)
   {
       int i, k, y;
       for (k = 1; k < n; k++) 
       {
         y = x[k];
        for (i = k-1; i >=0 && y < x[i]; i--)
        {
           x[i+1] = x[i];
        }
            //fin for
         x[i+1] = y;
       }
        //fin for
   }

   public static void main(String[]args)
   {
             int []a= new int[10];
             Random r = new Random();
             for(int i=0;i<a.length;i++)
              {
                a[i]=r.nextInt()+i;
              }
              
            //ordena elementos
            insercionSimple(a,a.length);
            
            //Imprime elementos
            for(int i=0;i<a.length;i++)
            {
              System.out.print(a[i]+ "\t");
             }
             
             //Busqueda Binaria
             int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Valor a Buscar"));
             int celda= busquedaBinaria(a,n,0,a.length-1);
   }
}