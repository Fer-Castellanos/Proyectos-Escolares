package Unidad2;


/**
 * Write a description of class Nodo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nodo
{
    int info;
    Nodo izquierdo,derecho;
    
    public Nodo(int dato)
    {
        info=dato;
        izquierdo=null;
        derecho=null;
    }
}