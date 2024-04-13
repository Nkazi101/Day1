package Classes;

public abstract class Animal {

    private String name;

    private String breed;

    private int age;

    private String color;

    private String gender;


    //abstract method //contract
    abstract void eating();

    // public void eating(){
    //     System.out.println("Animal is eating");
    // }


    public void soundMaking(){
        System.out.println("Makes sound");
    }




    
}
