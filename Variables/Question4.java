package Variables;

import java.util.Scanner;

public class Question4 {


    public static void main(String[] args){


        int number;

        Scanner input = new Scanner(System.in);

        //prompt the user for a number using println
        System.out.println("Enter a number? ");

        //assigning a value to number using our Scanner object called input.
        number = input.nextInt();

        System.out.println("The value you entered before conversion is: " + number);
        
        //cast the value of entered from integer to "something with one decimal place"
        double newvalue = (double) number;

        System.out.println("The value you entered after conversion is: " + newvalue);

        





    }
    
}
