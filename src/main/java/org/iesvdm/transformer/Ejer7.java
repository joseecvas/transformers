package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.List;

public class Ejer7 implements GnericObject {

    public static void main(String[] args) {
        List<String> s = new ArrayList<String>();
        s.add("hola");
        s.add("Jose");
        s.add("soy");
        s.add("alumno");
        s.stream().filter(p->Ejer7.check(p)).toList();
    }

    @Override
    public boolean check(Object object) {
        return (String.valueOf(object).length() >= 4);
    }
}