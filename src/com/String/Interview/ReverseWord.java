package com.String.Interview;

// Given an input string , reverse the String word by word

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWord {

    public static void main(String args[]) throws IOException {


        System.out.println("Enter the string you want to reverse :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        ReverseWord word = new ReverseWord();
        word.withOut("Hello");
    }

   public void withOut(String Original)
   {
       String reverse = "";
       char ch[] = Original.toCharArray();
       for(int i = Original.length()-1; i >=0; i--)
       {
           reverse = reverse+ch[i];
       }

       System.out.println("Reverse Sting is" + Original + "wwithoout function is " + reverse.toString());

   }
}

