package BigONotation;

import java.util.Scanner;

public class BigO {


    public static void main(String[] args){



        // 0(1) - Constant Time

        // no loops involved
        // the size of the data doesn't determine the speed in which it completes

        Scanner input = new Scanner(System.in);

        System.out.println("What's your name");


        String name = input.nextLine();

        // for(int i = 0; i < name.length(); i++){

        // }

        
        System.out.println("Your name is: " + name);


           //Strings are collection of the data type char
           //treats strings like arrays

            // char[] name1 = {'N', 'k', 'a', 'z', 'i'};

        // //linear time 0(N)
        // //because the size of the name has a positive relationship with how many times the loop will iterate 

        for(int i = 0; i < name.length(); i++){

            System.out.println(name.charAt(i));
        }

        //quadratic time
        //nested for loop - 2D arrays, comparing values in an array

        int[] numbers = {3,5,6,8,8,9,10};

        //outer loop
        for(int i = 0; i < numbers.length; i++){ 

            //inner loop
            for(int j = i + 1; j < numbers.length; j++){

                if(numbers[i] == numbers[j]){
                    System.out.println(numbers[i] + " is a duplicate");
                }
            }
        }


        //linear time
        for(int i = 0; i < numbers.length; i++){


            if(numbers[i] == 10){

                System.out.println("You've found the value 10");
                System.out.println(numbers[i]);
                break;
            }
        }






    }
    
}
