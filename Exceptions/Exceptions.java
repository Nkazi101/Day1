package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args)
    {







    }
    

    public static void readFile(String fileName) throws FileNotFoundException {

        if(fileName != null){
            Scanner scanner = new Scanner(new File(fileName));
           
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
            }
        }
        else{

            throw new FileNotFoundException();
        }

    }

    public static int divide(int a, int b){

        if(b != 0){
        return a / b;
        }
        else{
            throw new ArithmeticException();
        }

    }
}
