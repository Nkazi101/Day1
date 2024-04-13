package Lab1;

import java.util.Scanner;

import FilesAndStreams.ScannerStuff;

public class LabOne {


    public static void main(String[] args){


        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a leap year");
        year = input.nextInt();

        determineleapYear(year);

    }


    public static void determineleapYear(int year){


        //evenly divisible means there is no remainder

        //step 1
        //if the year is evenly divisible by 4
        if(year % 4 == 0){
            //step 2
            if(year % 100 == 0){
                //step 3
                if(year % 400 == 0){
                    //step 4
                    System.out.println("The year is a leap year(it has 366 days)");
                }else{
                    //step 5
                    System.out.println(year + " The year is not a leap year");
                }
            }else{

                //step 4
                System.out.println(year + " The year is a leap year(it has 366 days)");
            }
        }else{
            //step 5 
            System.out.println(year + " The year is not a leap year");
        }

    }


    //if (condition) { code that will run if the condition is satisfied } else
    

    
}
