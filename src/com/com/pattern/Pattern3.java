package com.com.pattern;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int noOfRow = sc.nextInt();

        int rowCount = 1;

        // printing space
        for(int i = noOfRow; i >= 0 ; i--)
        {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            //Printing * at the end of each row

            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print("* ");
            }

            System.out.println();

            rowCount++;

        }




    }
}
