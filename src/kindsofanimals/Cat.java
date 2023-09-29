package kindsofanimals;

public class Cat extends Animal {

    public  Cat(String name){
        super(name);
        System.out.println("Cat: " + name + " added.");
        setSprayed(true);
    }
}
