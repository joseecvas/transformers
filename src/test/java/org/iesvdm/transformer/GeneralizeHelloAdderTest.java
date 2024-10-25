package org.iesvdm.transformer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class GeneralizeHelloAdderTest {
    @Test
    public void test() {
        HelloAdder hiThere = new HelloAdder("Hi there! ");
        String name = "Jose";
        System.out.println(hiThere.greet(name));
        Assertions.assertEquals("Hi there! Jose", hiThere.greet(name));
    }
}
