package Arrays;

import java.util.Scanner;

public class ReadingInput {


    public static void main(String[] args)
    {

        // String firstName;
        // int age;

        
        //initializing a scanner to read user input from the keyboard
        //dependency injection
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");

        String firstName = input.nextLine();

        System.out.println("What is your age?");

        int age = input.nextInt();

        System.out.println("Hi " + firstName + " your age is " + age);


       
    }
    
}
