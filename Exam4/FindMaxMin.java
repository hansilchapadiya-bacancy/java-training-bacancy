/*

Question 2: Find Maximum & Minimum
Write a program to:
Store numbers in an array
Find the maximum and minimum values using loops

*/

package Exam4;

import java.util.Scanner;

public class FindMaxMin extends ArrayTraversal {

    // Declaring data member
    protected int minimum;
    protected int maximum;

    // Default Constructor
    // Assigning Default values
    public FindMaxMin() {
        this.maximum = Integer.MIN_VALUE;
        this.minimum = Integer.MAX_VALUE;
    }

    // Getting maximum value
    public int getMaximum() {
        return maximum;
    }

    // Getting minimum value
    public int getMinimum() {
        return minimum;
    }

    @Override
    // Displaying Array
    public void display() {

        System.out.println(); // new line
        for (int i = 0; i < this.size; i++) {

            // Checking for minimum
            if (this.minimum > this.array[i]) {
                this.minimum = this.array[i];
            }

            // Checking for maximum
            if (this.maximum < this.array[i]) {
                this.maximum = this.array[i];
            }

            // Traversing array one by one
            System.out.print("Index : " + (i + 1) + " = " + this.array[i] + "\n");

        }
        System.out.println(); // new line

    }

    public static void main(String[] args) {

        // Create scanner object and assign to Scanner class referecne variable
        Scanner sc = new Scanner(System.in);

        // Create object of ArrayTraversl Class
        FindMaxMin arrTraverse = new FindMaxMin();

        // Getting size from the User
        System.out.println("Enter Size of the array: ");
        int size = Integer.parseInt(sc.nextLine());

        // Setting size to Array
        arrTraverse.setSize(size);

        // Local Array creation
        int[] localArray = new int[arrTraverse.getSize()];

        System.out.println("Enter values for Push: \n");

        for (int i = 0; i < arrTraverse.getSize(); i++) {

            System.out.print("Enter value: " + (i + 1) + " = ");
            localArray[i] = Integer.parseInt(sc.nextLine());

        }

        // setting array to main array
        arrTraverse.setArray(localArray);

        // traversing an array
        arrTraverse.display();

        // Getting Max value
        System.out.println("\nMaximum value = " + arrTraverse.getMaximum());

        // Getting Min value
        System.out.println("\nMinimum value = " + arrTraverse.getMinimum());

        // closing scanner
        sc.close();

    }

}
