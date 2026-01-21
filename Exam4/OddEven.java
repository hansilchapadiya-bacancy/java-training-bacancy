/*

Question 3: Even & Odd Count
Write a program to:
Store numbers in an array
Count how many numbers are even and odd

*/

package Exam4;

import java.util.Scanner;

public class OddEven extends ArrayTraversal {

    // Declaring data members
    protected int odd[];
    protected int even[];
    protected int oddIdx;
    protected int evenIdx;

    // Default Constructor
    // Assigning Default values
    OddEven() {
        this.oddIdx = 0;
        this.evenIdx = 0;

    }

    // Displaying array
    @Override
    public void display() {

        this.even = new int[this.size];
        this.odd = new int[this.size];

        System.out.println(); // new line
        for (int i = 0; i < this.size; i++) {

            // Checking for even element
            if (this.array[i] % 2 == 0) {

                even[evenIdx++] = this.array[i];

            } else if (this.array[i] % 2 == 1) { // Checking for odd element

                odd[oddIdx++] = this.array[i];

            }

            // Traversing array one by one
            System.out.print("Index : " + (i + 1) + " = " + this.array[i] + "\n");

        }
        System.out.println(); // new line

    }

    // Get Odd array
    public int[] getOdd() {
        return odd;
    }

    // Get Even array
    public int[] getEven() {
        return even;
    }

    public static void main(String[] args) {

        // Create scanner object and assign to Scanner class referecne variable
        Scanner sc = new Scanner(System.in);

        // Create object of ArrayTraversl Class
        OddEven oddeven = new OddEven();

        // Getting size from the User
        System.out.println("Enter Size of the array: ");
        int size = Integer.parseInt(sc.nextLine());

        // Setting size to Array
        oddeven.setSize(size);

        // Local Array creation
        int[] localArray = new int[oddeven.getSize()];

        System.out.println("Enter values for Push: \n");

        for (int i = 0; i < oddeven.getSize(); i++) {

            System.out.print("Enter value: " + (i + 1) + " = ");
            localArray[i] = Integer.parseInt(sc.nextLine());

        }

        // setting array to main array
        oddeven.setArray(localArray);

        // traversing an array
        oddeven.display();

        // Getting even Count
        System.out.println("\nEven Count = " + oddeven.evenIdx);

        // Getting Even array
        localArray = oddeven.even;
        System.out.print("Even Array: ");
        for (int i : localArray) {

            if (i != 0)
                System.out.print(i + " ");

        }
        System.out.println("\n");

        // Getting Odd Count
        System.out.println("\nOdd Count = " + oddeven.oddIdx);

        // Getting Odd array
        localArray = oddeven.odd;
        System.out.print("Odd Array: ");
        for (int i : localArray) {

            if (i != 0)
                System.out.print(i + " ");

        }
        System.out.println("\n");

        // closing scanner
        sc.close();
    }

}
