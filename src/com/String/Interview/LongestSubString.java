package com.String.Interview;

import java.util.HashMap;

import static java.lang.System.out;

/*
* Given a String find the length of the longest substring without repeating char
*
* Ex : - Given ' abcabcbb' the answer is 'abc', Which is the length is 3.
* */
public class LongestSubString {

    public static void main(String args[])
    {
        LongestSubString string = new LongestSubString();
       System.out.println(string.lengthOfLongestString("abcabcbb"));
    }
    public int lengthOfLongestString(String s)
    {
        //The basic idea is , keep a hashmap which stores the characters in String as key and their position is values
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max =0;


        // Keep to pointers which define the max substring.
        for(int i =0, j = 0; i < s.length(); ++i )
        {
            // If the character is already in the hashmap
            if(map.containsKey(s.charAt(i)))
            {
                // Move the left pointer to the right of the same chara
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i -j +1);

        }
        return max;

    } // Time comp
}
