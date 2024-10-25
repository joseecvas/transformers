package org.iesvdm.transformer;


import java.util.ArrayList;
import java.util.List;

public class Joiners
{
    //Usa el método join() de la clase JoinByAdding, para unir dos LispList sumando sus argumentos, mediante recursividad.
    //Cabe destacar la estructura de la LispList, que se divide en dos partes, la cabeza "head()" y el resto. Esto es fundamental para la operación.
    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2)
    {
        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else
        {
            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            return t.cons(h);
         }
    }
    //zipArayList
    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner, ArrayList<T> l1, ArrayList<T> l2)
    {
        ArrayList list = new ArrayList();
        ArrayList empty = new ArrayList();

        if(l1.isEmpty()||l2.isEmpty())
            return empty;
        else
        {
            T h = joiner.join(l1.getFirst(),l2.getFirst());
            l1.remove(l1.getFirst());
            l2.remove(l2.getFirst());
            list.add(h);
            ArrayList<T> t = zipArrayLists(joiner, l1, l2);
            return list;
        }
    }
}