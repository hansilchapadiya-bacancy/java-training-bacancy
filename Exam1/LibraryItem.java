package Exam1;

abstract public class LibraryItem {
    protected int itemID;
    protected String title;

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemID() {
        return this.itemID;
    }

    public String getTitle() {
        return this.title;
    }

    public void displayDetails() {

        System.out.println("Item id =  " + this.itemID);
        System.out.println("Item Title = " + this.title);

    }

    abstract public void getLoanPeriod();

}
