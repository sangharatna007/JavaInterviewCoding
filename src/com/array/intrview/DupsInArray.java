package com.array.intrview;
// Write a program to find the duplicate element

import java.util.HashMap;
import java.util.HashSet;

public class DupsInArray {
    public static void main(String args[])
    {
        int array[] = {2,3,4,5,6,6,5};

//        for(int i= 0; i < array.length; i++)
//        {
//            for(int j = i+1; j < array.length; j++)
////                if(array[i] == array[j])
//                if(array[i] == array[j] && i != j)
//                {
//                    System.out.println("Duplicate element is" + array[i]);
//                }
//        }


        // ********** Using HashSet *************

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < array.length; i++)
        {
            if(! set.add(array[i]))
            {
                System.out.println("Duplicate element are" + array[i]);
            }


        }

    }
}
