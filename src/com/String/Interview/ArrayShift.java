package com.String.Interview;

/* We are giving Sting
* EveryWhite space charachter must be replaced with following three char %20*/


public class ArrayShift {

    public  static void main(String args[])
    {
        ArrayShift shift = new ArrayShift();
        System.out.println(shift.replace("o meri jaan hai"));
    }
    String replace(String s) {
        char[] chars = s.toCharArray(); // converted Sting into charArray
        for(int i = 0; i < s.length(); ++i) { // iterate the loop to end of the String length
            if(chars[i] == ' ') { // If character have space
                for(int j = s.length() - 3; j > i; --j) {
                    chars[j+2] = chars[j];
                }
                chars[i] = '%';
                chars[i+1] = '2';
                chars[i+2] = '0';
            }
        }

        return new String(chars);
    }


}
