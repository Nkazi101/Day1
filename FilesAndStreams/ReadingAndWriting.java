package FilesAndStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadingAndWriting {


    public static void main(String[] args){

    
        String fileName = "/Users/nkazi/Documents/JP022024/FilesAndStreams/practice.csv";
        

        try(BufferedWriter w1 = new BufferedWriter(new FileWriter(fileName))){
            
            //buffered writer to write to a file. csv file
            // FileWriter f1 = new FileWriter(fileName);
          

            w1.write("First Name, Last Name, Employee ID");
            w1.newLine();

            w1.write("John, Wick, 1");
            w1.newLine();

            w1.write("Denzel, Washington, 2");
            w1.newLine();

            w1.write("Jason, Bourne, 3");
            w1.newLine();

            w1.write("Mission Impossible, whatever, 4");
            w1.newLine();


        }
        catch(IOException e){

            e.printStackTrace();
        }

        readFromExcelSheet(fileName);
       

        
        
    }

    public static void readFromExcelSheet(String fileName){

        try(Scanner input = new Scanner(new File(fileName))){
            // String line;
            System.out.println("Reading file");
            
            while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    
}
