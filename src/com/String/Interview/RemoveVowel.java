package com.String.Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveVowel {

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String inputString = sc.nextLine();
//    String test = "Sangha";
    /* Using preDefine Function*/
//    String newString = inputString.replaceAll("[AEIOUaeiou]", "");
//    System.out.println("The String without Vowel" + newString);
    List<Character> list = new ArrayList<Character>();
    list.add('A');list.add('E');list.add('I');list.add('O');list.add('U');
    list.add('a');list.add('e');list.add('i');list.add('o');list.add('u');
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < inputString.length(); i++)
    {
        char ch = inputString.charAt(i);
        if(!list.contains(ch))
        {

            sb.append(ch);

        }


    }
    System.out.println("Without vowel" + sb);

   sc.close();


}

}
