package org.iesvdm.transformer;

public class HelloAdder implements Transformer<String>
{
    private String greeting;
    public HelloAdder(String greet) {
        this.greeting = greet;
    }

    public HelloAdder() {
    }

    public String transform(String str)
    {
        return "Hello "+str;
    }
    public String greet(String s){
        return greeting + s;
    }
}
