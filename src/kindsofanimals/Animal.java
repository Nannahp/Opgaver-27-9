package kindsofanimals;

 public class Animal {
     private String name;
     private boolean sprayed = false;

     public Animal(String name){
         this.name = name;
     }

     public void setSprayed(boolean sprayed) {
         this.sprayed = sprayed;
     }

     public boolean isSprayed() {
         return sprayed;
     }

     public String getName() {
         return name;
     }
 }
