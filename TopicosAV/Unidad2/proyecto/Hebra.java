package Unidad2.proyecto;


/**
 * Write a description of class Hebra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hebra
{
   int info;
   Hebra izquierdo;
   Hebra derecho;
   int enlace;
  /* Constructor */
  public Hebra(int x) {
  info = x;
  izquierdo = null;
  derecho = null;
   enlace = 1;
 }
}

