import java.util.Scanner;

//Chloe Arranza 9/15/17

public class CoffeeShop{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Thanks a Latte Bistro, what can I get started for you?");
    //small pun for the name of the Coffee Shop
    String order = in.nextLine();
    System.out.println("May I have a name for that please?");
    String name = in.nextLine();
    System.out.println("Alright this will only be a few minutes..");

    System.out.println(name+ " your Tall, Non-Fat Latte with a Caramel Drizzlee is ready!");

    System.out.println("Oh, wait, I'm sorry! Here is your " + order + "Have a good day");

  }
}
