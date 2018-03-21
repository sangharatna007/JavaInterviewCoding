package com.design.pattern;

public class SingleTonClass {

    public static SingleTonClass instance = null;  // create static class variable

    private SingleTonClass()  // create private constrctor
    {

    }

    public static SingleTonClass getInstance()   // create static method
    {
        if (instance == null)
            instance = new SingleTonClass();
        return instance;
    }
}
