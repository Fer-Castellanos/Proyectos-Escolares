
import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 * Write a description of class SeleccionDirecta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeleccionDirecta
{
  public static void selectSort(int x[],int n)
	{
		int indice,large;
		
		for(int index=n-1; index>0; index--)
		{
			large=x[0];
			indice=0;
			for(int jondex=1; jondex<=index; jondex++)
			{
				if(x[jondex]>large)
				{
					large=x[jondex];
					indice=jondex;
				}
			}
			x[indice]=x[index];
			x[index]=large;
		}
		System.out.println(Arrays.toString(x));
		JOptionPane.showMessageDialog(null,Arrays.toString(x));
	}
	
	public static void main(String[] args)
	{
		int n=9;
		SecureRandom random=new SecureRandom();
		int[] numeros=new int[n];
		for(int index=0; index<numeros.length; index++)
		{
			numeros[index]=random.nextInt();
			System.out.println(numeros[index]);
		}
		JOptionPane.showMessageDialog(null, Arrays.toString(numeros));
		selectSort(numeros,n);
	}

}




