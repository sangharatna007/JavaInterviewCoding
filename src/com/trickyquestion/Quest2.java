package com.trickyquestion;



    public class Quest2
    {
        public static void main(String[] args)
        {
            A a = null;

            a.staticMethod();
        }
    }
class A
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}

