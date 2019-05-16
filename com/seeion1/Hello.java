package com.seeion1;

public class Hello {
    private int asd;
 
    public Hello() {
 
    }
 
    public Hello(int argument) {
        asd = argument;
 
    }
 
    public int foo(int a, int b) {
        return (a + b) * (a - b);
    }
 
    public static void main(String[] args)
 
    {
        Hello hello1 = new Hello();
        Hello hello2 = new Hello(99);
        System.out.println(hello1.foo(5, 3));
        System.out.println(hello2.asd);
        String shit = args[0];
        System.out.println(shit);
    }
 
}