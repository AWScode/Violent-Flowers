import java.util.*;

public class ConnectFour {

  //Instance Variables here
  String[][] board;
  //rows
  String[] column1;
  String[] column2;
  String[] column3;
  String[] column4;
  String[] column5;
  String[] column6;
  String[] column7;

  Boolean gameOver;

  public ConnectFour() {
    //Constructor Method here
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
    if ();
  }

  // Other methods here
  public void displayBoard(){
    for (int j = 0; j < 6; j++) {
      String row = "";
      for (int i = 0; i < 7; i++) {
        row = row + board[i][j] + " ";
      }
      System.out.println(row);
    }
  }

  public void addPiece(int columnInd) {

    public void addPiece() {
    System.out.println("Add piece to a column");
    Scanner scanner = new Scanner(System.in);
    int columnInt = scanner.nextInt();

    while(true){
        if(columnInt > 7){
            System.out.println("That's not a valid column");
            break;
        }
        if (board[columnInt][0] == "0") {
            board[columnInt][0] = "1";
            break;
        }
        else if(board[columnInt][0] == "1"){
          if(board[columnInt][6] == "1"){
            System.out.println("This  column is full");
          }
          for(int k = 1; k < 6; k++){
            if(board[columnInt][k] == "0"){
                board[columnInt][k] = "1";
                break;
              }
            }
        }
}
}
  }

  public void checkFour() {
    //do something here
  }

  public static void main(String[] args) {
    ConnectFour newGame = new ConnectFour();
    newGame.displayBoard();
    newGame.checkFour();
    String player = "2";

    while (true) {
      if (player.equals("1")) {
        player = "2";
      }
      else{
        player = "1";
      }
      System.out.println("Player" + player + "s turn.");

      Scanner newSc = new Scanner(System.in);
      newGame.displayBoard();
      System.out.println("Where do you want to play?");
      Int col = newSc.nextInt();
      newGame.addPiece(col,player);

    }
  /*  Int col = 1;
    String player = "1";
    newGame.addPiece(col, player); */
  }
}
