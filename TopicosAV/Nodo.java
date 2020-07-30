
/**
 * Write a description of class Nodo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nodo
{
   Object info;
   Nodo next;
   Nodo prev;

  public Nodo(Object dato)
   {
	info=dato;
	next=null;
	prev=null;
 }
}