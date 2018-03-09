/*
Chloe Arranza
March 7, 2018
Connect Four
*/

import java.util.Scanner;

public class ConnectFour {

//here is the actual board (which is changed to look more like the board rather than 0 and 1)
  public static String[][] createBoard() {

    String[][] f = new String[7][15];

    for (int i =0;i<f.length;i++) {

       for (int j =0;j<f[i].length;j++) {
        if (j% 2 == 0){
           f[i][j] ="|";
        } else {
           f[i][j] = " ";
        }

        if (i==6) f[i][j]= "-";
      }

    }
    return f;
  }

//here we show the board on the screen
  public static void printBoard(String[][] f) {
    for (int i =0;i<f.length;i++) {
      for (int j=0;j<f[i].length;j++) {
        System.out.print(f[i][j]);
      }
      System.out.println();
    }
  }

//prompts the red user to drop a red disk
  public static void dropRedBoard(String[][] f) {
    System.out.print("Please drop a red disk at column (0–6): ");
    Scanner scan = new Scanner (System.in);
    int c = 2*scan.nextInt()+1;
    for (int i =5;i>=0;i--) {
      if (f[i][c] == " ") {
        f[i][c] = "R";
        break;
      }
    }
  }

//prompts the green user to drop a green disk
  public static void dropGreenBoard(String[][] f) {
    System.out.print("Please drop a green disk at column (0–6): ");
    Scanner scan = new Scanner (System.in);
    int c = 2*scan.nextInt()+1;
    for (int i =5;i>=0;i--) {
      if (f[i][c] == " ") {
        f[i][c] = "G";
        break;
      }
    }
  }


//here we check four
  public static String checkFour(String[][] f) {
    for (int i =0;i<6;i++) {
      for (int j=0;j<7;j+=2) {
        if ((f[i][j+1] != " ")
        //searched how to use && "&& is logical. & evaluates both sides of the operation"
        && (f[i][j+3] != " ")
        && (f[i][j+5] != " ")
        && (f[i][j+7] != " ")
        && ((f[i][j+1] == f[i][j+3])
        && (f[i][j+3] == f[i][j+5])
        && (f[i][j+5] == f[i][j+7])))

          return f[i][j+1];
      }
    }

    for (int i=1;i<15;i+=2) {
      for (int j =0;j<3;j++) {
            if((f[j][i] != " ")
            && (f[j+1][i] != " ")
            && (f[j+2][i] != " ")
            && (f[j+3][i] != " ")
            && ((f[j][i] == f[j+1][i])
            && (f[j+1][i] == f[j+2][i])
            && (f[j+2][i] == f[j+3][i])))
              return f[j][i];
      }
    }

    for (int i=0;i<3;i++) {

      for (int j=1;j<9;j+=2) {
            if((f[i][j] != " ")
            && (f[i+1][j+2] != " ")
            && (f[i+2][j+4] != " ")
            && (f[i+3][j+6] != " ")
            && ((f[i][j] == f[i+1][j+2])
            && (f[i+1][j+2] == f[i+2][j+4])
            && (f[i+2][j+4] == f[i+3][j+6])))
              return f[i][j];
      }
    }

    for (int i=0;i<3;i++) {
      for (int j=7;j<15;j+=2) {
            if((f[i][j] != " ")
            && (f[i+1][j-2] != " ")
            && (f[i+2][j-4] != " ")
            && (f[i+3][j-6] != " ")
            && ((f[i][j] == f[i+1][j-2])
            && (f[i+1][j-2] == f[i+2][j-4])
            && (f[i+2][j-4] == f[i+3][j-6])))
              return f[i][j];
      }
    }

    return null;
  }

//main
  public static void main (String[] args) {
    String[][] f = createBoard();
    boolean loop = true;
    int count = 0;
    printBoard(f);
    while(loop) {
      if (count % 2 == 0) dropRedBoard(f);
      else dropGreenBoard(f);
      count++;
      printBoard(f);
      //what happens when the either player has one
      if (checkFour(f) != null) {
        if (checkFour(f) == "R"){
           System.out.println("Congrats, the red player has won!");
        } else if (checkFour(f)== "G") {
          System.out.println("Congrats, the green player has won!");
        }
        loop = false;
      }
    }
  }
}

//and here we have reached the end of the code
