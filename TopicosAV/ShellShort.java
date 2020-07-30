import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Write a description of class ShellShort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShellShort
{
   public static void shellSort(int[] x, int n, int[] increments, int numIncremento)
	{
		int incremento, j, k, span, y;
		for(incremento=0; incremento<numIncremento; incremento++)
		{
			//Insercion simple
			span=increments[incremento];
			for(j=span; j<n; j++)
			{
				y=x[j];
				for(k=j-span; k>=0&&y<x[k]; k=k-span)
				{
					x[k+span]=x[k];
				}
				x[k+span]=y;
			}
		}
		System.out.println(Arrays.toString(x));
	}
	
	public static void shellSortInverso(int[] x, int n, int[] increments, int numIncremento)
	{
		int incremento, j, k, span, y;
		for(incremento=0; incremento<numIncremento; incremento++)
		{
			//Insercion simple
			span=increments[incremento];
			for(j=span; j<n; j++)
			{
				y=x[j];
				for(k=j-span; k>=0&&y<x[k]; k=k-span)
				{
					x[k+span]=x[k];
				}
				x[k+span]=y;
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
