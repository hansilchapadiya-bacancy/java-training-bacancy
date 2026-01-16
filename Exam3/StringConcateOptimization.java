/*
Practical Question 2 (Performance Optimization – Mandatory)Problem Statement
Build a program that constructs a dynamic message using both String and StringBuilder, and compare their behavior.
Requirements
Create a loop that appends numbers or words to a string
Implement the same logic using:
String
StringBuilder
Print the final result in both cases
Expected Implementation Focus
Use + operator for String concatenation
Use append() for StringBuilder
Observe object creation and performance difference

*/

package Exam3;

public class StringConcateOptimization {

    public static void main(String[] args) {

        // Using String Literals

        String message = "";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 26; i++) {

            message += (char) ('A' + i); /// Create new Reference each time
        }
        long end = System.currentTimeMillis();

        System.out.print(message);
        System.out.println("\nTime = " + (end - start) + "ms");

        // using StringBuilder

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        StringBuilder textMessage = new StringBuilder();

        start = System.currentTimeMillis();
        for (int i = 0; i < 26; i++) {
            textMessage.append((char) ('A' + i)); // Update existing StringBuilder object
        }
        end = System.currentTimeMillis();
        System.out.print(textMessage);
        System.out.println("\nTime = " + (end - start) + "ms");

    }
}
