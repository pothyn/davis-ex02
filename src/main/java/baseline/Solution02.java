/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Davis
 */
package baseline;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner in = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");

        // Read given input by user
        String str = in.nextLine();

        // Print back user input and length using System.out.println
        System.out.println(str+" has "+str.length() + " characters.");
    }
}