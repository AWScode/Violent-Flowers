/*
Chloe Arranza
Computer Science
May 7, 2018
*/

import java.awt.*;
import java.awt.event.*;



public class Restaurant extends Frame{

private Button a;

   public Restaurant(){
         addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
             System.exit(0);
           }
         });
    a = new Button("Click Here!");
    a.setBounds(90,100,100,30);
    add(a);
  setSize(1200,750);
  setLayout(null);
  setVisible(true);


}

public static void main(String[] args) {
  Restaurant m = new Restaurant();

}

}
