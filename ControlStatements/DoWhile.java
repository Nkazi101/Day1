package ControlStatements;

public class DoWhile {


    public static void main(String[] args)
    {
        int x = 21;

        //the statement in the do will ALWAYS execute/run at least one regardless of the condition
        do{
            System.out.println("Value of x " + x);
            x--;
            //x = x - 1;
        }
        while(x >= 20);
    }
    
}


//increment: increase the value of int variable by 1
//decrement: decrease the value of variable by 1