package Session5;

public interface Person {
    
    public void showPersonDetails();
    public String[] showCoreSkills();

    default void species(){
        System.out.println("Species: Homosapien");
    }

    static void timeZone(){
        System.out.println("Timezone : IST");
    }

}
