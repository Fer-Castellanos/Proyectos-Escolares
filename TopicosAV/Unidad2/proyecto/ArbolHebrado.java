package Unidad2.proyecto;


/**
 * Write a description of class ArbolHebrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArbolHebrado
{
    
  Hebra raiz;
  public ArbolHebrado( )
  {
  raiz= null; //apuntador al árbol hebrado
 }
 
  //Retorna apuntador a raíz del árbol hebrado
  public Hebra getRaiz()
  {
   return raiz;
 }

  public void creaArbolBinario(int x) {
  Hebra p, q;
   if (raiz == null)
   raiz = new Hebra(x); //raiz del árbol binario
   else { //avanza a los niveles del árbol binario
   p = raiz;
   q = raiz;
   while (q != null && p.enlace == 0) {
    p = q;
   if (x < p.info)
   q = p.izquierdo; //avanza al hijo izquierdo
   else
   q = p.derecho; //avanza al hijo derecho
  }
 
   if (x < p.info)
    hijoIzquierdo(p, x); //genera nuevo hijo izquierdo del nodo p
   else
    hijoDerecho(p, x); //genera nuevo hijo derecho del nodo p
   }
 }

   //Genera nuevo hijo izquierdo
  
   public void hijoIzquierdo(Hebra p, int x)
   {
    Hebra q = new Hebra (x);
    p.izquierdo = q;
    /*el sucesor en entrorden del nodo q es el nodo p*/
    q.derecho = p;
    q.enlace = 1; //indica que es una hebra
  }
  
  //Genera nuevo hijo derecho
   
  public void hijoDerecho(Hebra p,int x) 
    {
     Hebra q = new Hebra (x);
     /* guardar el sucesor en entreorden del nodo p */
      Hebra r = p.derecho;
      p.derecho = q;
      p.enlace= 0;
      //indica que deja de ser hebra
      q.izquierdo = null;
    /* el sucesor en entreorden del nodo q es el sucesor previo del nodo p */
    q.derecho = r;
    q.enlace = 1; //indica que es una hebra
  }
  
    /* Recorrido en entreorden */
     public void entreOrden()
    {
        Hebra p, q;
        p = raiz;
      do {
           q = null;
      while (p != null)
      { 
          /* recorrido de la rama izquierda */
         q = p;
         p = p.izquierdo;
      }
      /* fin de while */
       
      if (q != null) {
      System.out.print("\t" + q.info);
       p = q.derecho;
       while (q.enlace == 1 && p != null) {
       System.out.print("\t" + p.info);
       q = p;
       p = p.derecho; /* usa la hebra en vez de la pila */
      }
      /* fin de while */
     }
     /* fin de if */
    }while (q != null);
  }
   
}




