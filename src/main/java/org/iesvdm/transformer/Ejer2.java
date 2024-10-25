package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.List;

public class Ejer2 {
    public static void main(String[] args) {
        Transformer<Integer> trans = new TenTimes();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        ArrayList<Integer> b=Transformers.applyDest(trans,a);
        System.out.println(b);
    }
}
