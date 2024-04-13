package Lab2;

import java.util.Scanner;

public class LabTwo {


    public static void main(String[] args)
    {

        //declaring a Scanner object(instance of a class) called "input" which is able to read from the standard input stream
        //instance of a class = representation of a class = ambassador of a class
        Scanner input = new Scanner(System.in);
        //declared a variable to store the user's choice
        int choice;

    
        do {

            System.out.println("Pick an item from the menu below: ");
            System.out.println("1. Find the maximum value");
            System.out.println("2. Find the minimum value");
            System.out.println("3. Find the middle value");
            System.out.println("4. XOR function");
            System.out.println("5. Find the factor");
            System.out.println("6. Check if perfect number");
            System.out.println("7. Check if prime number");
            System.out.println("8. Exit the program");

            

            //we used the scanner object called "input" to assign a value to the variable "choice"
            choice = input.nextInt();


            switch(choice){


                case 1:

                System.out.println("Enter the first integer");
                int a = input.nextInt();
                System.out.println("Enter the second integer");
                int b = input.nextInt();
                System.out.println("Enter the third integer");
                int c = input.nextInt();
                int maximum = max3(a, b, c);
                System.out.println("The maximum value is: " + maximum);
                
                break;


                case 2:

                System.out.println("Enter the first integer");
                int a1 = input.nextInt();
                System.out.println("Enter the second integer");
                int b1 = input.nextInt();
                System.out.println("Enter the third integer");
                int c1 = input.nextInt();
                int minimum = min3(a1, b1, c1);
                System.out.println("The minimum value is: " + minimum);


                case 3:

                System.out.println("Enter the first integer");
                int a2 = input.nextInt();
                System.out.println("Enter the second integer");
                int b2 = input.nextInt();
                System.out.println("Enter the third integer");
                int c2 = input.nextInt();
                int middle = middle3(a2, b2, c2);
                System.out.println("The middle value is: " + middle);

                case 4:

                System.out.println("Did you get an A in math");
                boolean toyiaAnswer = input.nextBoolean();
                System.out.println("Did you get an A in science");
                boolean toyiaAnswer2 = input.nextBoolean();
                boolean response = xor(toyiaAnswer, toyiaAnswer2);
                System.out.println(response);
                case 5:

                System.out.println("Enter a value to evaluate");
                int a3= input.nextInt();
                System.out.println("Enter a possible factor");
                int b3 = input.nextInt();
                boolean factor = isFactor(a3, b3);
                System.out.println(factor);

                case 6:

                case 7:

                default:
                System.out.println("Please enter a valid number.");



            }
        }
        while(choice != 8);


    }

    //if you're planning on calling a method within the same class you declared it, then make the method static
    public static int max3(int a, int b, int c){

        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
       
        return max;

    }

    public static int min3(int a, int b, int c){

        int min = a;

        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        // System.out.println("The minimum value is " + min);
        return min;

    }

    public static int middle3(int a, int b, int c){

        int sum = a + b + c;

        int mid = sum - max3(a, b, c) - min3(a, b, c);

        return mid;



    }

    //what does the OR operator look like ||
    //OR means 1 of 2 statements must be true
    ////what does the OR operator look like &&
    //AND means both statements must be true
    public static boolean xor(boolean a, boolean b){

        
        //if either(OR) of values is true: represented by an OR statement
        //another condition which we represenent with an AND statement
        //if both(AND) of them are NOT true
        //if ((false OR true) AND NOT(FALSE AND TRUE))
        if((a || b) && !(a && b)){

            return true;
        }
        else{
            return false;
        }

    }


    public static boolean isFactor(int n, int k){

        // n = 48;
        // k = 4;

        //modulus operator 
        if(n % k == 0){

            return true;

        }
        if(n % k != 0){

            return false;
        }
        else {
            return false;
        }
    }

    
}
