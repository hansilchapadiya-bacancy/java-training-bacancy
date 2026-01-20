package Session4;

public interface InterFaceMethods {

    public void abstractMethod();

    public default void defaultMethod() {
        System.out.println("This is default method");
    }

    static void staticMethd() {
        System.out.println("This is static method");
    }

}
