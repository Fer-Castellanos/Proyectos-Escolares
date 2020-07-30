package Unidad2;


/**
 * Write a description of class Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbol
{
    
    Nodo raiz;
    
    public Arbol()
    {
        raiz=null;  //apuntador al arbol binario
    }
    
    //genera nuevo hijo izquierdo
    
    
    public void hijoIzquierdo(Nodo p,int x)
    {
        p.izquierdo=new Nodo(x);
    }
    
    //genera nuevo hijo Derecho
    public void hijoDerecho(Nodo p,int x)
    {
        p.derecho=new Nodo(x);
    }
    //Retorna apuntador a raiz del arbol
    public Nodo getRaiz()
    {
        return raiz;
    }
    
    public void creaArbolBinario(int x)
    { 
        Nodo p, q;
        if (raiz == null)
         raiz = new Nodo(x); //raiz del árbol binario
        else { //avanza a los niveles del árbol binario
            p = raiz; 
            q = raiz;
            while (q != null) 
            {
                p = q; 
                if (x < p.info
                ) q = p.izquierdo; //avanza al hijo izquierdo
                else
                q = p.derecho; //avanza al hijo derecho
            }
           
            if (x < p.info)
            hijoIzquierdo(p, x); //genera nuevo hijo izquierdo del nodo p
            else
            hijoDerecho(p, x); //genera nuevo hijo derecho del nodo p
        }
    }
        
    /* Recorrido en preorden */
        public void preOrden(Nodo p){
            if (p != null)
            {
                System.out.print(p.info + "\t"); preOrden(p.izquierdo); preOrden(p.derecho);
            } 
    } 
    
    /* Recorrido en entreorden */
    public void entreOrden(Nodo p) 
    {
        if (p != null) 
        {
            entreOrden(p.izquierdo);
            System.out.print(p.info + " \t"); entreOrden(p.derecho);
        } 
    
    }
    
    /* Recorrido en posorden */ 
    public void posOrden(Nodo p)
    { 
        if (p != null)
        { 
            posOrden(p.izquierdo);
            posOrden(p.derecho); 
            System.out.print(p.info + "\t");
        }
    }

}


