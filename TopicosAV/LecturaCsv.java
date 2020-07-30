import java.util.*;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
/**
 * Write a description of class LecturaCsv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LecturaCsv
{
    public static final String SEPARATOR= ",";
    public static final String QUOTE="\"";
    public static File archivo = null;
    
    public static void main(String[]args)
    {
        BufferedReader br =null;
        try
        {
            archivo = new File("C:\\Users\\patyc\\OneDrive\\Documentos\\LecturaCvs.txt");
            //verifica si existe el archivo
            if(archivo.exists())
           {
            //Abre archivo y canal de flujo
            br =new BufferedReader(new FileReader("C:\\Users\\patyc\\OneDrive\\Documentos\\LecturaCvs.txt"));
            String line = br.readLine();
            while(null!=line)//leer hasta fin de archivo
            {
                String [] fields = line.split(SEPARATOR);
                System.out.println(Arrays.toString(fields));
                
                //fields = removeQuotes(fields
                //System.out.println(Arrays.toString(fields));
                
                line = br.readLine();//Leer linea del archivo
            }//fin while
            if(br != null)
            {
                br.close();//cierre del archivo
            }
          }
          else
          System.out.println("El archivo no existe");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
      }
 }
      
