/*
Chloe Arranza
March 7, 2018
Connect Four
*/

import java.util.*;

public class ConnectFour {

  //Instance Variables here
  String[][] board;
  //these are where the columns will be
  String[] column1;
  String[] column2;
  String[] column3;
  String[] column4;
  String[] column5;
  String[] column6;
  String[] column7;

  Boolean gameOver;

  public ConnectFour() {
    //this is the actual values for the connect four board
    this.column1 = new String[6];
    this.column1[0] = "0";
    this.column1[1] = "0";
    this.column1[2] = "0";
    this.column1[3] = "0";
    this.column1[4] = "0";
    this.column1[5] = "0";

    this.column2 = new String[6];
    this.column2[0] = "0";
    this.column2[1] = "0";
    this.column2[2] = "0";
    this.column2[3] = "0";
    this.column2[4] = "0";
    this.column2[5] = "0";

    this.column3 = new String[6];
    this.column3[0] = "0";
    this.column3[1] = "0";
    this.column3[2] = "0";
    this.column3[3] = "0";
    this.column3[4] = "0";
    this.column3[5] = "0";

    this.column4 = new String[6];
    this.column4[0] = "0";
    this.column4[1] = "0";
    this.column4[2] = "0";
    this.column4[3] = "0";
    this.column4[4] = "0";
    this.column4[5] = "0";

    this.column5 = new String[6];
    this.column5[0] = "0";
    this.column5[1] = "0";
    this.column5[2] = "0";
    this.column5[3] = "0";
    this.column5[4] = "0";
    this.column5[5] = "0";

    this.column6 = new String[6];
    this.column6[0] = "0";
    this.column6[1] = "0";
    this.column6[2] = "0";
    this.column6[3] = "0";
    this.column6[4] = "0";
    this.column6[5] = "0";

    this.column7 = new String[6];
    this.column7[0] = "0";
    this.column7[1] = "0";
    this.column7[2] = "0";
    this.column7[3] = "0";
    this.column7[4] = "0";
    this.column7[5] = "0";

    this.board = new String[7][6];
    this.board[0] = column1;
    this.board[1] = column2;
    this.board[2] = column3;
    this.board[3] = column4;
    this.board[4] = column5;
    this.board[5] = column6;
    this.board[6] = column7;

    this.gameOver = false;
  }

  // Get and Set Methods here
  public void getPiece(){

  }

  // this is displaying the board
  public void displayBoard(){
    for (int j = 0; j < 6; j++) {
      String row = "";
      for (int i = 0; i < 7; i++) {
        row = row + board[i][j] + " ";
      }
      System.out.println(row);
    }
  }

//this is where the we add a piece on the connect four board
  public Boolean addPiece(int columnInd, String player) {
    columnInd = columnInd - 1;
    for (int i = 5; i > -1; i--) {
      if (board[columnInd][i].equals("0")) {
        board[columnInd][i] = player;
        break;
      }
      if (i == 0) {
        return false;
      }
    }
    return true;
      //Place a piece in the column that is passed in.
      //Find the lowest possible empty space and fill.
      //The largest row number that is empty.
  }

//in order to check if the player has gotten a four in a row, this is the check
  public Boolean checkFour() {
    int count = 0;

    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 6; j++) {


        if (board[i][j].equals("1")) {
          count = 1;
          for (int k = 1; k < 4; k++) {
            //up-right
            if (j-k > -1) {
              if (i + k < 7) {
                if (board[i+k][j-k].equals("0")) {
                  count = 1;
                  break;
                }
                else if (board[i+k][j-k].equals("2")) {
                  count = 1;
                  break;
                }
                else {
                  count++;
                  if (count == 4){
                    gameOver = true;
                    break;
                  }
                }
              }
            }
          }
          count = 1;
          for (int k = 1; k < 4; k++) {
            //right
            if (i + k < 7) {
              if (board[i+k][j].equals("0")) {
                count = 1;
                break;
              }
              else if (board[i+k][j].equals("2")) {
                count = 1;
                break;
              }
              else {
                count++;
                if (count == 4){
                  gameOver = true;
                  break;
                }
              }

            }
          }

          count = 1;
          for (int k = 1; k < 4; k++) {
            //bottom-right
            if (j+k < 6) {
              if (i + k < 7) {
                if (board[i+k][j+k].equals("0")) {
                  count = 1;
                  break;
                }
                else if (board[i+k][j+k].equals("2")) {
                  count = 1;
                  break;
                }
                else {
                  count++;
                  if (count == 4){
                    gameOver = true;
                    break;
                  }
                }
              }
            }
          }
          count = 1;
          for (int k = 1; k < 4; k++) {
            //bottom
            if (j+k < 6) {
              if (board[i][j+k].equals("0")) {
                count = 1;
                break;
              }
              else if (board[i][j+k].equals("2")) {
                count = 1;
                break;
              }
              else {
                count++;
                if (count == 4){
                  gameOver = true;
                  break;
                }
              }
            }
          }
        }


        if (board[i][j].equals("2")) {
          count = 1;
          for (int k = 1; k < 4; k++) {
            //up-right
            if (j-k > -1) {
              if (i + k < 7) {
                if (board[i+k][j-k].equals("0")) {
                  count = 1;
                  break;
                }
                else if (board[i+k][j-k].equals("1")) {
                  count = 1;
                  break;
                }
                else {
                  count++;
                  if (count == 4){
                    gameOver = true;
                    break;
                  }
                }
              }
            }
          }
          count = 1;
          for (int k = 1; k < 4; k++) {
            //right
            if (i + k < 7) {
              if (board[i+k][j].equals("0")) {
                count = 1;
                break;
              }
              else if (board[i+k][j].equals("1")) {
                count = 1;
                break;
              }
              else {
                count++;
                if (count == 4){
                  gameOver = true;
                  break;
                }
              }

            }
          }

          count = 1;
          for (int k = 1; k < 4; k++) {
            //bottom-right
            if (j+k < 6) {
              if (i + k < 7) {
                if (board[i+k][j+k].equals("0")) {
                  count = 1;
                  break;
                }
                else if (board[i+k][j+k].equals("1")) {
                  count = 1;
                  break;
                }
                else {
                  count++;
                  if (count == 4){
                    gameOver = true;
                    break;
                  }
                }
              }
            }
          }
          count = 1;
          for (int k = 1; k < 4; k++) {
            //bottom
            if (j+k < 6) {
              if (board[i][j+k].equals("0")) {
                count = 1;
                break;
              }
              else if (board[i][j+k].equals("1")) {
                count = 1;
                break;
              }
              else {
                count++;
                if (count == 4){
                  gameOver = true;
                  break;
                }
              }
            }
          }
        }
      }
    }
    return gameOver;
  }

//main area
  public static void main(String[] args) {
    ConnectFour newGame = new ConnectFour();
    newGame.displayBoard();
    newGame.checkFour();
    String player = "2";
    int turnCount = 1;

    while (true) {
      if (player.equals("1")) {
        player = "2";
      }
      else {
        player = "1";
      }
      System.out.println("Player " + player + "s turn.");

      Boolean added = false;
      //what is shown when playing a piece
      while (!added) {
        Scanner newSc = new Scanner(System.in);
        System.out.println("Please place your chip (choose a column number 1-7)");
        int col = newSc.nextInt();
        added = newGame.addPiece(col, player);
        if (!added) {
          System.out.println("Column full, please choose another play.");
        }
      }
      //show the turn count which i thought was really great
      System.out.println(" ");
      System.out.println(" (._.) ( L: ) ( .-. ) ( :L ) (._.) Turn " + turnCount + " (._.) ( L: ) ( .-. ) ( :L ) (._.) ");
      System.out.println(" ");
      newGame.displayBoard();
      System.out.println(" ");
      Boolean end = newGame.checkFour();

      turnCount++;
//what happens when the game ends
      if (end == true) {
        System.out.println("The Game has Ended! Thanks for playing ");
        System.out.println("Player " + player + " wins!");
        break;
      }

    }

    //newGame.addPiece(col, player);






  }
}
