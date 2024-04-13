package ControlStatements;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Main Menu");
        System.out.println("1. Calculate the area and circumference");
        System.out.println("2. Calculate the area of a triangle");
        System.out.println("3. Calculate Even Or Odd");
        System.out.println("5. Vegan");
        System.out.println("Please choose from options 1 - 5");

        int choice = input.nextInt();

        
        //switch(variable)

        

        switch(choice) {

            case 1:
            System.out.println("You've selected chicken. It'll arrive shortly");
            break; //stops it from going to the next case

            case 2: 
            System.out.println("You've selected Beef. It'll arrive shortly");
            break;

            case 3:
            evenorOdd();
            break;

            default:
            System.out.println("PLease enter a valid number");



        }

        
       

    }


    public static String evenorOdd(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = input.nextInt();
            
        if(number % 2 == 0)
        {
           
            System.out.println("the number is even");
            return "The number is even";
            
        }
        else{
            System.out.println("the number is odd");
            return "The number is odd";
        }

    }
    
}
