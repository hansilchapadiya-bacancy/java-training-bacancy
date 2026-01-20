package Session4;

abstract class SomeClass {
};

public class Main {

    public static int a = new SomeClass(){

    public int run() {
        System.out.println("Run");
        return 0;
    }

    }.run();

    public static void main(String[] args) {

        // InterFaceMethods im = new InterFaceMethods() {

        // public InterFaceMethods run() {
        // System.out.println("Run");
        // return null;
        // }

        // @Override
        // public void abstractMethod() {
        // run();
        // // return run();
        // }
        // }.run();

        // im.abstractMethod();
        // im.run();

        // InterFaceMethods im = new Implementation(10){

        // public void run(){
        // // abstractMethod();
        // System.out.println("I am in annonymous class");
        // }

        // @Override
        // public void abstractMethod(){

        // run();
        // }

        // };

        // im.abstractMethod();

        System.out.println(a);

    }

}
