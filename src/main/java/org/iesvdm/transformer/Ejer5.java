package org.iesvdm.transformer;

import java.util.List;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        LispList<Integer> ls = LispList.empty();
        LispList<Integer> ls2 = ls.cons(1).cons(2).cons(3);
        List<Integer> numeros  = Transformers.TransformList(new TenTimes(), ls2);
        System.out.println(numeros);

    }
}
