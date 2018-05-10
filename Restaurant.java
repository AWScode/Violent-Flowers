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
private Checkbox Dr;
private Checkbox Up;
private Checkbox Beets;
private Checkbox T;
private Checkbox Water;
private Label drinksList;
private Checkbox Pasta;
private Checkbox Curry;
private Checkbox Nachos;
private Checkbox Pizza;
private Checkbox Dumpling;
private Label menu;
private Checkbox Brownie;
private Checkbox Pie;
private Label desserts;

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

    drinksList = new Label("Drinks:");
    drinksList.setBounds(100, 220, 100, 30);
    add(drinksList);

    menu = new Label("Entrées:");
    menu.setBounds(280, 220, 100, 30);
    add(menu);

    desserts = new Label("Desserts:");
    desserts.setBounds(550, 220, 100, 30);
    add(desserts);

// all the drinks
    Dr = new Checkbox("Dr. Radical");
        Dr.setBounds(100, 250, 150, 30);
        add(Dr);
    Up = new Checkbox("64-Up");
        Up.setBounds(100, 270, 150, 30);
        add(Up);
    Beets = new Checkbox("Beets by J");
        Beets.setBounds(100,290,100, 30);
        add(Beets);
    T = new Checkbox("Ice-T");
        T.setBounds(100, 310, 100, 30);
        add(T);
    Water = new Checkbox("Basic Water");
        Water.setBounds(100,330,150,30);
        add(Water);

// all the food
    Pasta = new Checkbox("Hasta La Pasta");
        Pasta.setBounds(280,250,200,30);
        add(Pasta);
    Curry = new Checkbox("Keep Calm and Curry On");
        Curry.setBounds(280,270,200,30);
        add(Curry);
    Nachos = new Checkbox("It's Nachos, It's Mine!");
        Nachos.setBounds(280,290,200,30);
        add(Nachos);
    Pizza = new Checkbox("Do You Want a Pizza Me?");
        Pizza.setBounds(280,310,200,30);
        add(Pizza);
    Dumpling = new Checkbox("You're All That and Dim Sum");
        Dumpling.setBounds(280,330,220,30);
        add(Dumpling);
// all the desserts
    Brownie = new Checkbox("Robert Brownie Jr.");
        Brownie.setBounds(550, 250, 200,30);
        add(Brownie);
    Pie = new Checkbox("3.14");
        Pie.setBounds(550, 270, 100, 30);
        add(Pie);


  // this the the actual frame limits of which i created for the pop up
  setSize(1200,750);
  setLayout(null);
  setVisible(true);
  setBackground(Color. pink);


}

// main frame
public static void main(String[] args) {
  Restaurant m = new Restaurant();

}

}
