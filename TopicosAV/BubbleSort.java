
/**
 * Write a description of class BubbleSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSort
{
   public static void BubbleSort(int x [],int n)
    {
     int hold,j,pass;
     boolean switched=true;
     for(pass=0;pass <n-1 && switched ==true; pass++)
    {
    switched=false;
    for(j=0; j < n-pass-1; j++)
      if (x [j] > x [j+1])
      {
        switched=true;
        hold = x [j];
        x[j]=x[j+1];
        x[j+1]=hold;
      }
   }
  }
  
}
