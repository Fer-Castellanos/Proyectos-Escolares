import javax.swing.*;
/**
 * Write a description of class Hashing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hashing
{
   
   public static void place(Nodo f[ ],int i,int valor)
   {
       Nodo nodo = new Nodo(valor);
       Nodo aux1 =null;
       Nodo aux2 =null;
       
       //coloca el primer nodo
       
       if(f[i] == null)
       {
           f[i] = nodo;
        }
        else if((int)nodo.info <= (int)f[i].info)
       {
            Nodo p = f[i];
            f[i] =nodo;
            nodo.next = p;
        }
        else
        { //coloca un nodo intermedio o al final
          
          aux1 =aux2 = f[i];
          
          while(aux2 != null && (int)nodo.info > (int)aux2.info)
          {
            aux1 = aux2;
            aux2 = aux2.next;
          }
                
          if(aux1.next == null)
           aux1.next =nodo; //inserta al final
          else if((int)nodo.info < (int)aux2.info)
          {
            aux1.next = nodo;//inserta intermedio
            nodo.next =aux2;
          }
       }
   }

    public void hashingSort (int x[ ]) {  
     Nodo f[ ] = new Nodo[10];
     //arreglo de apuntadores a listas enlazadas
     
     int posicion;   
     /* Inicializa arreglo de apuntadores a listas enlazadas */ 
     
     for (int i = 0; i < f.length; i++) {    
      f[i] = null; } 
    
      for (int i = 0; i < x.length; i++) {   
          posicion = x[i] / f.length; 
          //aplica la function f para ubicar el subarchivo    
          place(f, posicion, x[i]); 
          
          
          //coloca el elemento en la lista enlazada ordenada 
     }
     /* Procesa arreglo de apuntadores y almacena en arreglo original */ 
     int i = 0;
     for (int j = 0; j < f.length; j++) {   
         Nodo p = f[j]; 
         //apuntador a la lista enlazada  
       
       while (p != null) {     
          x[i++] = (int)p.info;   
          p = p.next;  
       }
    }
  }
}