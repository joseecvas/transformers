package org.iesvdm.transformer;

//The class Transformers implements a method where the arguments are Transformer (with its parameter) and a List of the same parameter.
//The method applyConst will use the transform method of the Transformer interface.
import java.util.ArrayList;
public class Transformers
{
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a)
    {
        ArrayList<T> b = new ArrayList<>();
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }
    public static <T> ArrayList<T> applyDest(Transformer<T> tran, ArrayList<T> a)
    {
        ArrayList<T> b = new ArrayList<>();
        b.addAll(a);
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }
}

