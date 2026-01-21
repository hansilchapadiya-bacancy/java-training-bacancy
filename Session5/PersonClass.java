package Session5;

public class PersonClass implements Person {

    String name;
    float height;
    String skils[];
    String gender; 

    PersonClass() {

        this.name = "";
        this.height = 0.0f;
        this.skils = new String[5];
        this.gender = "";

    }

    PersonClass(String name, float height, String[] skills, String gender) {

        this.name = name;
        this.height = height;
        this.skils = skills;
        this.gender = gender;

    }

    @Override
    public void showPersonDetails() {

        System.out.println("Person Details: ");
        System.out.println("Name: " + this.name);
        System.out.println("Height: " + this.height);
        System.out.println("Gender: " +  this.gender);
        System.out.println("Skills: ");


        for (String s : skils) {

            System.out.print(s + " ");

        }

    }

    @Override
    public String[] showCoreSkills() {
    
        return this.skils;

    }

    public String toString1(){
        return "For Person Identity";
    }
}
