package Exam1;

public class Book extends LibraryItem {

    @Override
    public void getLoanPeriod() {

        System.out.println("Loan Period for Book = " + 10 + " Months");

    }

}
