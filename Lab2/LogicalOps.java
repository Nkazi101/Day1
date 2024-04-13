package Lab2;

public class LogicalOps {


    public static void main(String[] args){


        int x = 45;

        evalx(x);




    }



    public static void evalx(int x){


        if((x == 0 || x < 50) && !(x < 0)){
            System.out.println("The number is in range");
        }

    }
    
}
