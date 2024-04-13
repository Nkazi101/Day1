package FilesAndStreams;

import java.io.FileReader;
import java.util.Scanner;

public class ScannerStuff {


    public static void main(String[] args){



        Scanner input = new Scanner(System.in);

        System.out.println("What's your number? ");

        // int number = input.nextInt();

        String input1 = input.nextLine();

        int number1 = Integer.parseInt(input1);


        System.out.println(number1);

        // Scanner fr = new Scanner(new FileReader("input.txt"));



    }
    
}
