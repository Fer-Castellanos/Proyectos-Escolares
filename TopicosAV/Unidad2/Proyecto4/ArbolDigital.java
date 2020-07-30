package Unidad2.Proyecto4;


/**
 * Write a description of class ArbolDigital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArbolDigital
{

   Nodo raiz; //apuntador a la raiz

    public ArbolDigital()

    {

        raiz = null;

    }

    public String search(String key)

    { 

       Nodo p = raiz;

        Nodo father = null;

        boolean found = false;

        int i = 0;

        while (found == false)

        {  

            Nodo q = null;

            boolean paste = false;

            while ( p != null && paste == false)

            {

                if (p.symbol >= (byte)key.charAt(i))

                paste = true;

                else

                {

                    q = p; p = p.brother;

                }
                
                //fin if

            }

            found = true;

            if (p == null || p.symbol > (byte)key.charAt(i))

            {

                insert(p, q, father, i, key);

                //inserta registro de datos.

                return "La llave " + key + " fue insertada!!";

            }

            else

            if (i == key.length()-1)

            return "La llave " + key + " fue encontrada!!";

            //registro encontrado

            else

            { 

                father = p;

                p = p.son;

                found = false;

                i++;

            }
            //fin if

        }
        //fin while

        return "";

    }
    //fin de search

    public void insert(Nodo p, Nodo q, Nodo father, int i, String key)

    {

        Nodo s = new Nodo((byte)key.charAt(i));

        s.brother = p;

        if (raiz == null)

        raiz = s;

        else

        if (q != null)

        q.brother = s;

        else

        if (father == null)

        raiz = s;

        else

        father.son = s;

        //Inserta los simbolos restantes de la llave

        int j = i;

        while (j < key.length()-1)

        {

            father = s;

            s = new Nodo((byte)key.charAt(j+1));

            father.son = s;

            s.brother = null;

            j++;

        }
        //fin de while

    }
    //fin de insert

     public void preOrden(Nodo p) {

        if(p != null) {

            System.out.print(p.symbol + "\t");

            preOrden(p.son);

            preOrden(p.brother);

        }

    }

}

    