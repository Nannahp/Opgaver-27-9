package Transports;

public class Plane extends Vehicle{

    public void fly(){
        startEngine();
        System.out.println(
                "Plane is flying"
        );
    }
}
