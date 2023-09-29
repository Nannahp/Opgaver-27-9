package Transports;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        new Program().run();
    }

    private void run() {
        Plane plane = new Plane();
        Car car = new Car();
        Ship ship = new Ship();
        ArrayList<Vehicle> vehicles= new ArrayList<>(List.of(plane,car,ship));

        for(int i =0; i< vehicles.size(); i++){
            if (vehicles.get(i) instanceof Plane){
                ((Plane) vehicles.get(i)).fly();
            }
            if (vehicles.get(i) instanceof Car){
                ((Car) vehicles.get(i)).drive();
            }
            if (vehicles.get(i) instanceof  Ship){
                ((Ship) vehicles.get(i)).sail();
            }
        }


    }
}
