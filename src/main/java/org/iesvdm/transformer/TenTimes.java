package org.iesvdm.transformer;
//It uses the interface Transformer. In this case, the method transform multiplies a number by ten.
public class TenTimes implements Transformer<Integer>
{
    public Integer transform(Integer n)
    {
        return n*10;
    }
}
