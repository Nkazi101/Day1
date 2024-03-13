package ControlStatements;

import java.util.Scanner;

public class IfStatement {


    public static void main(String [] args)

    {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");


        int age = input.nextInt();

        if(age > 16)
        {

            System.out.println("You are allowed to drive!");
        }
        //instead
        else if(age < 12)
        {
            System.out.println("You def shouldn't be driving. For sure!");
        }

        else{
            System.out.println();
        }


    }
    
}
