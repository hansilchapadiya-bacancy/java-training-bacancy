package Exam3;

public class StringCompare {

    public static void main(String[] args) {

        // Declaration

        String referenceVar1 = "Hansil";
        String referenceVar2 = "Hansil";

        String obj1 = new String("Hello");
        String obj2 = new String("Hello");

        // Using == operator

        if (referenceVar1 == referenceVar2) {
            System.out.println("True: because memory reference is same and stored in string constant pool (SCP)\n");
        } else {
            System.out.println("Impossible to get false because '==' works on memory reference\n");
        }

        if (obj1 == obj2) {
            System.out.println("Impossible to get true because '==' works on memory reference\n");
        } else {
            System.out.println("False: Because both object memory allocation is different\n");
        }

        // using equals method

        if (referenceVar1.equals(referenceVar2)) {
            System.out.println(
                    "True: because memory reference is same and stored in string constant pool (SCP) and value also same\n ");
        } else {
            System.out.println("Impossible to get false because Both value is same\n");
        }

        if (obj1.equals(obj2)) {
            System.out.println(
                    "True: because equals method only match value and values are also same\n");
        } else {
            System.out.println("Impossible to get false because Both value is same\n");
        }

    }

}
