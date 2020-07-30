import java.util.Random;
/**
 * Write a description of class MetodoOrdenamiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MetodoOrdenamiento
{
    public static void main (String[] args){
       Random r =new Random();
       Hashing b = new Hashing();
       int x[]=new int[20];
       //genera numeros aleatorios
       for(int i = 0; i<x.length; i++)
       {
           x[i]=r.nextInt(99)+1;
        }
        //Aplica metodo de la burbuja
        b.hashingSort(x);
        
        //imprime elementos ordenados
        for(int i=0; i < x.length; i++)
        {
            System.out.println(x[i]);
        }
    }
}