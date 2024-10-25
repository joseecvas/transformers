package org.iesvdm.transformer;

//The class Transformers implements a method where the arguments are Transformer (with its parameter) and a List of the same parameter.
//The method applyConst will use the transform method of the Transformer interface.
import java.util.ArrayList;
import java.util.List;

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
    public static <T> List<T> TransformList(Transformer<T> tran, LispList<T> ls){
        if(ls.isEmpty()){
            return List.of();
        }
        List<T> transformed = new ArrayList<>();
        transformed.add(tran.transform(ls.head()));
        TransformList(tran, ls.tail());
        return transformed;
    }
}

