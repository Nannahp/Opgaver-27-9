package animalswithbehavior;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }
    public void scratch(){
        System.out.println("Scratching");
    }

    public void play(){
        System.out.println(" is playing");
    }


}
