package kindsofanimals;

import java.util.Scanner;

public class Shelter {
    Scanner scanner = new Scanner(System.in);
    Dog dog;
    Cat cat;
    Animal animal;
    public static void main(String[] args) {
        new Shelter().run();
    }

    private void run() {
        System.out.println("Welcome to the animal shelter\nWhat do you need to check in?");
        System.out.println("Dog(d),   Cat(c)   Other(o)");
        String animalType = scanner.nextLine();
        System.out.println("And what's their name?");
        String name = scanner.nextLine();
        checkInAnimal(animalType, name);
        System.out.println("Thank you for checking your animal in with us");


    }

    private void checkInAnimal(String animalType, String name) {
        switch (animalType.toLowerCase()){
            case "d":
                dog = new Dog(name);
                checkIfSprayed(dog);
                break;
            case "c":
                cat = new Cat(name);
        checkIfSprayed(cat);
        break;
            default:
        animal = new Animal(name);
                System.out.println("Animal: " + name + " added");
        checkIfSprayed(animal);
        break;}

    }

    public boolean checkIfSprayed(Animal animal){
        if(animal.isSprayed() == false){
            System.out.println("Note: "+ animal.getName() + " is not sprayed");
            return false;
        } else
        System.out.println("Note: " +animal.getName() + " is sprayed");
        return true;
    }


}
