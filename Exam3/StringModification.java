package Exam3;

public class StringModification {

    public static void main(String[] args) {


        // Using String Literals
        String reference_str1 = "Hello";
        reference_str1 += " World";
        System.out.println("String concatenation: " + reference_str1); // Using + operator 

        //Using String Object
        String object_str1 = new String("Hansil");
        object_str1  = object_str1.concat(" The great");
        System.out.println("String concatenation: " + object_str1); // Using concat method
     }

}
