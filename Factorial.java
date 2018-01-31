/*
Chloe Arranza
Factorial
January 30, 2018
*/
import java.util.*;


public class Factorial{

    public static void main(String[] args) {
      System.out.println("Hello, please insert a number you want the factorial of");
      Scanner help = new Scanner(System.in);
      int baseNum = help.nextInt();
      

      //  int number = 10;
        long fact = 1;
        for(int i = 1; i <= baseNum; i++)
          //for(start with, go up to, keep looping)
        {
            fact = fact * i;
        }
        System.out.println("The factorial of "+baseNum+" is: "+fact);
        //always make sure to print
    }
}
