package Session5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String SkillsSet[][] = { { "Coding", "Chess", "Astronomy" }, { "Reading", "Writing", "Walking" },
                { "Dieting, Maths, Excercise" }, { "Music", "Movies", "Singing" },
                { "Flying", "Swimming", "Reading" } };

        // Person p1 = new PersonClass();
        // System.out.println(p1.toString1());

        PersonClass p[] = new PersonClass[3];

        for (int i = 0; i < p.length; i++) {

            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter height: ");
            float height = Float.parseFloat(sc.nextLine());

            System.out.println("Enter Gender: ");
            String gender = sc.nextLine();

            p[i] = new PersonClass(name, height, SkillsSet[i], gender);

        }

        for (PersonClass personClass : p) {

            System.out.println();
            System.out.println();
            personClass.showPersonDetails();
            System.out.println();
            System.out.println();

        }

        sc.close();

    }
}
