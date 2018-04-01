package com.arrays;

 class ArrayElements {

    public static void main(String args[])
    {
        // createing and initializing array

        int arrayInt[]= new int[5];

        arrayInt[0] = 20;
        arrayInt[1] = 25;
        arrayInt[2] = 30;
        arrayInt[3] = 40;
        arrayInt[4] = 50;

        // accessing array of elements
        for(int i = 0; i < arrayInt.length; i++)
        {
            System.out.printf("Element of index \n " +   arrayInt[i], i);
        }
    }
}
