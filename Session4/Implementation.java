package Session4;

public class Implementation implements InterFaceMethods {

    Implementation(int x){
        System.out.println(x);
    }

    @Override
    public void abstractMethod(){

        System.out.println("I had Implemented abstractmethod");

    }

    @Override
    public void defaultMethod(){
        System.out.println("I am from Implementation Class");
    }
    
}