package ControlStatements;

public class EvenOrOdd {
    
    public static void main(String[] args)
    {

        //even number has no remainder when you divide it by 2
        //odd number has a remainder when you divide it by 2
        // no remainder - means that the remainder = 0;
        

        int number = 45;

        if(number % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }


    }

}
