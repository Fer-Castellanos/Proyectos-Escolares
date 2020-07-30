import java.util.Arrays;
import java.security.SecureRandom;
/**
 * Write a description of class InsercionSimple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsercionSimple
{
    public static void insercionSimple(int[] x)
	{
		int y, jondex;
		for(int index=1; index<x.length; index++)
		{
			y=x[index];
			for( jondex=index-1; jondex>=0&&y<x[jondex]; jondex--)
			{
				x[jondex+1]=x[jondex];
			}
			x[jondex+1]=y;
		}
		System.out.println(Arrays.toString(x));
	}
	
	public static void main(String[] args)
	{
		SecureRandom random=new SecureRandom();
		int [] arreglo=new int[7];
		for(int index=0; index<arreglo.length; index++)
		{
			arreglo[index]=random.nextInt();
			System.out.println(arreglo[index]);
		}
		insercionSimple(arreglo);
		
	}

}
