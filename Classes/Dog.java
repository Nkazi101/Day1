package Classes;

public class Dog {

    //variables, properties, fields
    private String breed;

    private int age;

    private String color;

    private String gender;


    public Dog(){

    }
     //constructors
     public Dog(String breed, int age, String color)
     {
         this.breed = breed;
         this.age = age;
         this.color = color;
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
        this.age = age;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }




    //methods - actions/behaviours
    public void bark(){


        System.out.println(breed + "Woof woof");

    }

    public void sleep(){

        System.out.println("I'm sleeping");

    }

    public void eat(){

        System.out.println("I'm eating");

    }

    

    
}
