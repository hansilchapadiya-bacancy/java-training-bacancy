/*
Practical Question 3 (String Operations – Mandatory)Problem Statement
Create a utility program to perform common String operations using both String and StringBuilder.
Requirements
Take a sample input String
Perform the following operations:
Reverse the string
Extract a substring from given indexes
Check if a word exists using contains()
Implement:
Reversal using StringBuilder
Substring and search using String */

package Exam3;

import java.util.Scanner;

public class StringOperation {

    public static void main(String[] args) {

        // Scanner object creation
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a Sample String = ");
        StringBuilder sampleString = new StringBuilder();
        sampleString.append(sc.nextLine());

        // Reverse String
        System.out.println("Reverse String = " + sampleString.reverse() + "\n");

        System.out.print("Enter a index for extracting Substring: ");
        int index = Integer.parseInt(sc.nextLine());

        sampleString.reverse();

        // Perform Substring Operation
        System.out.println("SubString = " + sampleString.substring(0, index));

        // Check whether word is exist or not
        System.out.print("Enter a word for check whether it is exist or not: ");
        String word = sc.nextLine();

        // Convert StringBuilder to String : toString also valid
         
        String sample = new String(sampleString);
        if(sample.contains(word)){
            System.out.println("Word is exist");
        }
        else{
            System.out.println("Word is not Exist");
        }

        sc.close();
    }
}
