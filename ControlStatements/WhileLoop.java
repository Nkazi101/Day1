package ControlStatements;

import java.util.Scanner;

public class WhileLoop {


    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("What number would you like to enter: ");

        int number = input.nextInt();

        //you use or leverage your variable to create conditions

        while(number <= 5){
            
            //print statement
            System.out.println("Hello");
            number++;
            //number = number + 1;
            
        }


    }

    
}
