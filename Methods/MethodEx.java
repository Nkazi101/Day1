package Methods;

import java.util.Scanner;

public class MethodEx {



        //access modififier //return type //parameters(input)
        public static int addNumbers(int firstNumber, int secondNumber)
        {
            int sum;
            sum = firstNumber + secondNumber;
            return sum;


        }

        public static String evenorOdd(int number)  {

            
            if(number % 2 == 0)
            {
               
                return "The number is even";
            }
            else{
              
                return "The number is odd";
            }

        }

        public static void main(String[] args)
        {

            Scanner input = new Scanner(System.in);
        //    int total = addNumbers(5,8);
        //    System.out.println(total);


           System.out.println("Enter the number you want to evaluate: ");

           int x = input.nextInt();

          String result = evenorOdd(x);

          System.out.println(result);



        }
        

    
    
}
