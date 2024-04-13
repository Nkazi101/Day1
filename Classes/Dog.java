package Classes;

import java.util.Arrays;

public class Dog extends Animal  implements AnimalBehaviours {

    //variables, properties, fields

    private String name;

    private String breed;

    private int age;

    private String color;

    private String gender;

    


    //setting the initial as empty
    public Dog(){

    }
     //constructors: set an initial state of an object
     public Dog(String breed)
     {
         this.breed = breed;
       
     }
 

     //getters and setters
     //getters: retrieve a value
    public String getBreed() {
        return breed;
    }


    //setters: modify a value
    public void setBreed(String breed) {
        this.breed = breed;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if(age < 0){

            this.age = age;
        }
        
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }




    //methods - actions/behaviours
    public void bark(){


        System.out.println(breed + "" +  "Woof woof");

    }

    public void sleep(){

        System.out.println("I'm sleeping");

    }

    public void eat(){

        System.out.println("I'm eating");

    }

    @Override
    public void eating(){
        System.out.println("Dog is eating" + 0.20);
    }

   public void soundMaking(int count){

    for(int i = 0; i < count; i++){
        System.out.println("Dog barks");
    }
   }

    

    
}
