package animalswithbehavior;

public abstract  class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void play(){
        System.out.println("Playing");
    }

}
