/*
Chloe Arranza
Computer Science
May 7, 2018
*/

import java.awt.*;
import java.awt.event.*;



public class Restaurant extends Frame{
//add all buttons, text area, list, boxes, etc. here as private

private Button a;
private Label title;

//add all the buttons and whatnots here
   public Restaurant(){
     // just here to close the window in general
         addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
             System.exit(0);
           }
         });

    a = new Button("Click Here!");
    a.setBounds(90,100,100,30);
    add(a);

// main title at the top
    title = new Label("Welcome to I Need a </br> Restaurant!");
    title.setBounds(400, 70, 700, 30);
    add(title);

  // this the the actual frame limits of which i created for the pop up
  setSize(1200,750);
  setLayout(null);
  setVisible(true);


}

// main frame
public static void main(String[] args) {
  Restaurant m = new Restaurant();

}

}

