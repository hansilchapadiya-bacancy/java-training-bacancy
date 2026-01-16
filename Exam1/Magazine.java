package Exam1;

public class Magazine extends LibraryItem {

    @Override
    public void getLoanPeriod() {

        System.out.println("Loan Period for Magazine = " + 3 + " Months");

    }

}