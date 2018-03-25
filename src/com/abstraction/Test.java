package com.abstraction;

class A
{
    {
        System.out.println("AAA");
    }
}

 class B extends A
{
    {
        System.out.println("BBB");
    }
}

class C extends B
{
    {
        System.out.println("CCC");
    }
}

public class Test
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}