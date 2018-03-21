package com.String.Interview;

/* Given a String s, find the longest palindromic substring
in s. you  may assume that the maximum lenth of s is 1000
Ex : input : "babad"
output : bab
* */

public class LongestPalindromicSubString {
    // Each Character is consider as the mid of  palindrom sting and the larges palindrom is checked

    private int lo, maxlen;

    public String LongestPalindrom(String s)
    {
        int len = s.length();
        if(len < 2)
            return s;

        for(int i= 0; i < len -1; i++)
        {
            // assume odd length try to extend palindrom as possible
            extendPalindrome(s, i, i);
        }
        return s.substring(lo, lo + maxlen);
    }

    private  void extendPalindrome(String s, int j, int k)
    {

    }
}

