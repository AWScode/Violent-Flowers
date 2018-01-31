public class Factorial{

    public static void main(String[] args) {

        int number = 10;
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("The factorial of "+number+" is: "+fact);
    }
}
