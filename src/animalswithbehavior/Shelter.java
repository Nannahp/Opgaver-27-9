package animalswithbehavior;

import java.util.ArrayList;

public class Shelter {
    public static void main(String[] args) {
        new Shelter().run();
    }

    private void run() {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        Dog dog1 = new Dog("Åe");
        Cat cat1 = new Cat("Bodil");

        animals.add(cat1);
        animals.add(dog1);

        dog1.play();
        cat1.play();

        cat1.scratch();
        dog1.beg();

        for(int i=0; i<animals.size(); i++){
            System.out.println(animals.get(i).getName() + " is a " + animals.get(i).getClass());
            if (animals.get(i) instanceof Cat){
            ((Cat)animals.get(i)).scratch();}
            if (animals.get(i) instanceof Dog){
                ((Dog) animals.get(i)).beg();

            }
            }
        }
}
