/*
Chloe Arranza
Computer Science
May 7, 2018
*/

import java.awt.*;
import java.awt.event.*;

public class Restaurant extends Frame{


   public Restaurant(){
         addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
             System.exit(0);
           }
         });

  setSize(400,300);
  setLayout(null);
  setVisible(true);


}

public static void main(String[] args) {
  Restaurant m = new Restaurant();

}
