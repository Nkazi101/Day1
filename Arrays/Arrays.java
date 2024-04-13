package Arrays;

import java.util.Scanner;


public class Arrays {


    public static void main(String [] args)

    {

        //first way of declaring an array
        int[] fruits = new int[7];

        //second way of declaring an array
        int[] ages = {34,23,45,19,05};

        

       

        //populating the array fruits with values using scanner and for loop

        //initialize the scanner
       
        try{
        Scanner input = new Scanner(System.in);

        //prompt the user to enter fruits
        System.out.println("Enter " + fruits.length + " fruits: ");

        //iterate through array to enter values at each index
        for(int index = 0; index < fruits.length + 2; index++){

            try{
           fruits[index] = input.nextInt();
            }
            catch(ArrayIndexOutOfBoundsException e){

                System.out.println("Wrong input. You've entered too many values");
            }
        
        }      
    
        //display all the fruits using the for loop
        for(int index = 0; index < fruits.length; index++){

            
            System.out.println(fruits[index]);
 
        
 
         } 
        

    
        }
    
catch(Exception e){

    System.out.println("Unexpected Error " + e.getMessage());

}

}
   
    
}

