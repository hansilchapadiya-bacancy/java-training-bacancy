/*

Question 1: Array Traversal
Write a program to:
Create an integer array with at least 5 values
Print all elements using a loop

*/

// packge declaration
package Exam4;

import java.util.Scanner;

public class ArrayTraversal {

    // Declaring data member
    protected int[] array;
    protected int size;

    // Default Constructor
    // Assigning Default values
    public ArrayTraversal() {
        this.size = 5;
        this.array = new int[size];
    }

    // Peramaterized Constructor
    // Assigning Parameter Values
    public ArrayTraversal(int[] array, int size) {
        this.array = array;
        this.size = size;
    }

    // Getting array by instance
    public int[] getArray() {
        return this.array;
    }

    // Getting size of the array
    public int getSize() {
        return this.size;
    }

    // Setting array by instance
    public void setArray(int[] array) {
        this.array = array;
    }

    // Setting size of array
    public void setSize(int size) {
        this.size = size;
    }

    // Displaying Array
    public void display() {

        System.out.println(); // new line
        for (int i = 0; i < this.size; i++) {

            // Traversing array one by one
            System.out.print("Index : " + (i + 1) + " = " + this.array[i] + "\n");

        }
        System.out.println(); // new line
    }

    public static void main(String[] args) {

        // Create scanner object and assign to Scanner class referecne variable
        Scanner sc = new Scanner(System.in);

        // Create object of ArrayTraversl Class
        ArrayTraversal arrTraverse = new ArrayTraversal();

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

        // closing scanner
        sc.close();

    }

}
