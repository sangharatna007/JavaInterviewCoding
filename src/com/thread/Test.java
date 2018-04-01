package com.thread;

public class Test {
    public static void main(String [] args)
    {
        //System.out.println(Math.round(Math.random()));
//        int a;
//        int b;
//        a = 2;
//        b = 5;
//        int c = Math.sqrt(a *a + b *b);
        Recursion recursion = new Recursion();
        System.out.println(recursion.funC(12));
    }
}

class Recursion
{
    int funC(int n)
    {
        int result;
        result = funC(n - 1);
        return result;

    }
}
