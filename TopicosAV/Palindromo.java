import javax.swing.*;
/**
 * Write a description of class Palindromo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palindromo
{
   public static void palindromo (String[]args)
 {
     
     String frase;
     frase = JOptionPane.showInputDialog(null, "Escriba la palabra");
     Palindromo r =new Palindromo(10);
      Colar =new Cola(10);
     
       
     for(int i=0; i<frase.length(); i++){
              
              if(frase.charAt(i)!=' '){
               p.push(frase.charAt(i));
              c.insertar(frase.charAt(i));
               
               } 
            } 
      boolean ok = true;
      while(p.isEmpty()==false && ok == true)
      {
          if ((Character)p.pop() == (Character)c.retirar())
             ok = true;
             
          else
             ok = false;
        }
       if (ok)
          JOptionPane.showMessageDialog(null,"Si es palindromo");
       else
       JOptionPane.showMessageDialog(null,"No es palindromo");
       
       
    }
}
    