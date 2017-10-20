//Chloe Arranza, October 20,2017
import java.util.*;

class Palindrome
{
   public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);

      System.out.println("You have entered Chloe's Computer. Enter a Palindrome to gain access.");
      original = in.nextLine();

      int length = original.length();

      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);

      if (original.equals(reverse))
         System.out.println("The inserted palindrome is correct. Access to Computer.");
      else
         System.out.println("The inserted palindrome is incorrect. Access denied.");

   }
}
