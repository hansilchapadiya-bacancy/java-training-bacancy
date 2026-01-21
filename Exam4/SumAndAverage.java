package Exam4;

import java.util.Scanner;

public class SumAndAverage extends ArrayTraversal {

    // Declaring data member
    protected int sum;
    protected double average;

    // Default Constructor
    // Assigning Default values
    public SumAndAverage() {
        this.sum = 0;
        this.average = 0;
    }

    // Getting average
    public double getAverage() {
        this.average = (double) this.sum / this.size;
        return average;
    }

    // Getting sum
    public int getSum() {
        return sum;
    }

    @Override
    public void display() {
        System.out.println(); // new line
        for (int i = 0; i < this.size; i++) {

            // Calculating sum
            this.sum += array[i];

            // Traversing array one by one
            System.out.print("Index : " + (i + 1) + " = " + this.array[i] + "\n");

        }
        System.out.println(); // new line
    }

    public static void main(String[] args) {
        // Create scanner object and assign to Scanner class referecne variable
        Scanner sc = new Scanner(System.in);

        // Create object of ArrayTraversl Class
        SumAndAverage arrTraverse = new SumAndAverage();

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

        // Getting Sum
        System.out.println("SUM of Array = " + arrTraverse.getSum());

        // Getting Average
        System.out.println("AVERAGE of Elements = " + arrTraverse.getAverage());

        // closing scanner
        sc.close();
    }
}
