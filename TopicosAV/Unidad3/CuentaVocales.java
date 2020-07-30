package Unidad3;
import java.io.*;

/**
 * Write a description of class CuentaVocales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaVocales
{
    
	public static void main(String[] args) 
	{
		final String FILE_NAME = ("C:\\Users\\patyc\\OneDrive\\Escritorio\\ABD-INGLES\\cuentaVocales.txt");
  	    
		try {
 			   int a = 0;
			   int e = 0;
			   int i = 0;
			   int o = 0;
			   int u = 0;
			   FileReader input = new FileReader(FILE_NAME);
			   int c = input.read(); //lee un caracter
			   while ( c != -1 ) //lee hasta encontrar el final del archivo
			   {
				   if ((char) c == 'a')
                      a++;
                   if ((char) c == 'e')
                      e++;
                   if ((char) c == 'i')
                      i++;          
                   if ((char) c == 'o')
                      o++;                      
                   if ((char) c == 'u')
                      u++;                                            
				   c = input.read();//lee un caracter
				 }
			     input.close(); //cierra el archivo
  			     System.out.println("Letra a aparece " + a + " veces");
				 System.out.println("Letra e aparece " + e + " veces");
				 System.out.println("Letra i aparece " + i + " veces");
				 System.out.println("Letra o aparece " + o + " veces");
				 System.out.println("Letra u aparece " + u + " veces");
			}
		  catch (IOException ex) 
		  {
				System.out.println("Algo malo a sucedido :-(");
		  }
		  finally
		  {

		  } 
	}
}
