package Unidad2.Proyecto4;


/**
 * Write a description of class Nodo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nodo
{
  
 byte symbol;
 Nodo son;
 Nodo brother;
 public Nodo(byte valor)
 {
  symbol = valor;
  son = null;
  brother = null;
 }
}