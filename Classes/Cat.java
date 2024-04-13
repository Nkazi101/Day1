package Classes;

public class Cat extends Animal {



    private String whiskers;


    @Override
    public void eating(){
        System.out.println("Cat is eating " +  0.10);
    }

    public void eating(String food){

        System.out.println("Cat is eating" + food);
    }

    
}
