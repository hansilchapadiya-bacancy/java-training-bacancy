public class Employee extends EmployeeStucture {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setID(10);
        e.setName("Hansil");
        e.setSalary(10000000.00);

        System.out.println(e.getID());
        System.out.println(e.getSalary());
        System.out.println(e.getName());
    }
}