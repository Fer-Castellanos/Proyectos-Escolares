import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 * Write a description of class QuickSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSort
{
   public void QuickSort(int x[ ] ,int lb,int ub)
   { int j;
     if(lb>=ub)
       return;
       
       j=partition(x,lb,ub);
       QuickSort(x,lb,j-1);
       QuickSort(x,j+1,ub);
       
    }
    
    public int partition(int x [ ] ,int lb,int ub)
    {
        int a ,down,up,temp;
        a=x [lb];
        up=ub;
        down=lb;
        
        while(down<up){
            while(x[down]<=a &&down < ub)
             down ++;
             while(x[up]>a)
              up --;
              if(down<up)
              { temp =x[down];
                 x[down]=x [up];
                 x[up]=temp;
                 x[lb]=x[up];
                 x[up]=a;
                 
                 
                }
            }
        return up;
     }
              
    }


        
    