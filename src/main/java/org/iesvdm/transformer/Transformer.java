package org.iesvdm.transformer;
//It is a functional interface. We can see that due to the fact that it has only one method.
public interface Transformer<T>
{
    public T transform(T obj);
}

