package Arrays;

import java.util.Scanner;

public class Arrays {


    public static void main(String [] args)

    {

        //first way of declaring an array
        String[] fruits = new String[7];

        //second way of declaring an array
        int[] ages = {34,23,45,19,05};

       

        //populating the array fruits with values using scanner and for loop

        //initialize the scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to enter fruits
        System.out.println("Enter " + fruits.length + " fruits: ");

        //iterate through array to enter values at each index
        for(int index = 0; index < fruits.length; index++){

           fruits[index] = input.nextLine();

        
        }      
        
        //display all the fruits using the for loop
        for(int index = 0; index < fruits.length; index++){

            System.out.println(fruits[index]);
 
        
 
         } 

    }

   
    
}
