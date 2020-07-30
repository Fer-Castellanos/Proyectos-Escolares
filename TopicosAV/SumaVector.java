 import java.util.Scanner;
/**
 * Write a description of class SumaVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumaVector
{
  public static int SumaVector(int a[], int s)

  {
    if (s == 0)

    {
     return a[s];
    }
     else

    {
     return a[s]+ SumaVector(a,s-1);
    }

   }

   public static void main (String [] args)

    {
       
        int a [] = new int[8];
        Scanner n = new Scanner(System.in);

       for(int i=0;i<a.length;i++)

       {
           System.out.println("numero");
           a[i]=n.nextInt();
       }

      System.out.println(SumaVector(a,a.length-1));

    }

 }