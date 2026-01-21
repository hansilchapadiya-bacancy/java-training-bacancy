
/*

Question 5: Loop Logic
Write a program to:
Print numbers from 1 to 50
Skip numbers divisible by 5 (use loop logic)

*/

package Exam4;

import java.util.Scanner;

public class LoopLogic extends ArrayTraversal {

    // Declaring data member
    protected int divisor;

    // Default Constructor
    // Assigning Default values
    LoopLogic() {
        this.divisor = 5;
    }

    // Setting new Divisor
    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    // Getting Divisor
    public int getDivisor() {
        return this.divisor;
    }


    // Overriding Display method
    @Override
    public void display() {
        System.out.println(); // new line
        for (int i = 0; i < this.size; i++) {

            if ((this.array[i] % this.divisor) == 0) {
                continue;
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
        LoopLogic looplogic = new LoopLogic();

        // Getting size from the User
        System.out.println("Enter Size of the array: ");
        int size = Integer.parseInt(sc.nextLine());

        // Setting size to Array
        looplogic.setSize(size);

        // Local Array creation
        int[] localArray = new int[looplogic.getSize()];

        System.out.println("Enter values for Push: \n");

        for (int i = 0; i < looplogic.getSize(); i++) {

            System.out.print("Enter value: " + (i + 1) + " = ");
            localArray[i] = Integer.parseInt(sc.nextLine());

        }

        // setting array to main array
        looplogic.setArray(localArray);


        // Getting Divisor from User

        System.out.println("\nEnter Divisor: ");
        looplogic.setDivisor(Integer.parseInt(sc.nextLine()));

        // traversing an array
        looplogic.display();

        // closing scanner
        sc.close();
    }
}
