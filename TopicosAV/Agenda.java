import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
/**
 * Write a description of class Agenda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Agenda
{
        static File archivo = null;
        static FileReader fr=null;
        static BufferedReader br=null;
        static FileWriter fichero=null;
        static PrintWriter pw=null;
        static final String SEPARATOR=",";
        static String ruta= "C:\\Users\\patyc\\OneDrive\\Escritorio\\agenda.txt";

       public static void main(String[]args)
       {
        
        String nombre;
        String correo;
        String celular;
       
        
           try{
             archivo = new File (ruta);
            //verifica si existe el archivo
             if(archivo.exists())
             {
                 //abrir archivo de texto para lectura
                 fr=new FileReader(archivo);
                 br= new BufferedReader(fr);
                 br.mark(100000);
                 
                 fichero=new FileWriter(ruta,true);
                 pw = new PrintWriter(fichero);
            
                 //menu del programa
             int opcion;
             do{
             opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu" + 
                                                                        "\n1. Capturar" + 
                                                                        "\n2. Buscar" + 
                                                                        "\n3. Imprimir" + 
                                                                        "\n4. Salir" + 
                                                                        "\n.  Opcion: "));
                             switch(opcion){
                              case 1://Capturar datos
                                     
                                     
                                         
                                         nombre= JOptionPane.showInputDialog(null,"Ingrese el nombre");
                                          correo= JOptionPane.showInputDialog(null,"Ingrese el correo");
                                          celular=JOptionPane.showInputDialog(null,"Ingrese el Celular:");
                                          pw.println(nombre + ";" + celular + "," + correo);
                                          pw.flush();//refrescar datos en el archivo
                                          
                                           
                                     
                                         break;
                                         case 2: //imprimir toda la informacion
                                    
                                     
                                          String amigo =JOptionPane.showInputDialog(null,"Nombre del amigo");
                                         boolean encontrado=false;
                                         br.reset();
                                         String linea =br.readLine();
                                         
                                         while(linea != null && !encontrado)
                                         {
                                             String [] fields =linea.split (SEPARATOR);
                                             if(amigo.equals(fields[0]))
                                             {
                                                 JOptionPane.showMessageDialog(null,Arrays.toString(fields));
                                                 encontrado=true;
                                                }
                                              
                                                else
                                            
                                                linea =br.readLine();
                                            }
                                            

		                              
                
            
                                     break;
                                     
                                     case 3: //Buscar toda la informacion
                                     
                                     
                                         br.reset();
                                         String linea2=br.readLine();
                                         System.out.println("------Agenda Telefonica-----");
                                         while(linea2!=null)
                                         {
                                         String[] fields=linea2.split(SEPARATOR);
                                         System.out.println(Arrays.toString(fields));
                                         linea2=br.readLine();
                                        }
                                          
                                        break;
                                     
                                     case 4:
                                           JOptionPane.showMessageDialog(null,"Fin!!");
                                            
                                           break;                   
                       
                                        }
              }while(opcion!=4);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
           
        } 
      }
    }

       
