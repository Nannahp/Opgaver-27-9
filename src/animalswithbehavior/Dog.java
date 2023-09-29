package animalswithbehavior;

public class Dog extends Animal{

    public Dog (String name){
        super(name);
    }
    public void beg(){
        System.out.println("Begging");
    }

    public void play(){
        System.out.println("Dog is playing");
    }
}
