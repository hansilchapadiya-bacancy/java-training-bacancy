public class EmployeeStucture {

    private int id;
    private String name;
    private Double salary;

    EmployeeStucture(){
        this.id=1;
        this.name="null";
        this.salary=0.0;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}