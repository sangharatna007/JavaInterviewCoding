package com.array.intrview;

public class ReverseVowel {

    /* Write a function that takes a string as input and reverse only the vowels of as String*/

    /* Example :
    * Given S = "Hello , retunn "Holle
    * */

    public String reverseVowels(String s)
    {
        if(s == null || s.length() == 0)
        {
            return s;
        }

        String vowels = "'aeiouAEIOU'";

        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while (start < end)
        {
            while (start < end && !vowels.contains(chars[start] + ""))
            {
                start++;

            }
            while (start < end && !vowels.contains(chars[end] + ""))
            {
                end--;

            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);



    }

}


