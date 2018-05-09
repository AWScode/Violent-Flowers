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
private Choice p;
private Label people;
private Checkbox Whey;
private Checkbox Punch;
//private Checkbox GridLayout;
//add all the buttons and whatnots here
   public Restaurant(){
     // just here to close the window in general
         addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
             System.exit(0);
           }
         });
//Number of People choice box
      Choice p = new Choice();
      p.setBounds(90,100,100,30);
      p.add("1");
      p.add("2");
      p.add("3");
      p.add("4");
      p.add("5");
      p.add("6");
      p.add("7");
      p.add("8");
      p.add("9");
      p.add("10");
      this.add(p);

//Number of people text
      people = new Label("Number of People");
      people.setBounds(70,50,200,85);
      add(people);
    /*a = new Button("Click Here!");
    a.setBounds(90,100,100,30);
    add(a);*/

// main title at the top
    title = new Label("I Need a </br>: Resturant for Coders");
    title.setBounds(400, 70, 700, 30);
    add(title);

    Whey = new Checkbox("Something in the Whey");
        Whey.setBounds(100, 250, 100, 30);
        add(Whey);
    Punch = new Checkbox("Cinnamon Toast Punch");
        Punch.setBounds(100, 270, 80, 30);
        add(Punch);



  // this the the actual frame limits of which i created for the pop up
  setSize(1200,750);
  setLayout(null);
  setVisible(true);
  setBackground(Color. lightGray);


}

// main frame
public static void main(String[] args) {
  Restaurant m = new Restaurant();

}

}
