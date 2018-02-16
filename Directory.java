/*
Chloe Arranza
Directory,java
Februrary 14,2018
*/

import java.util.*;


public class Directory{

 public static void main(String[] args) {
   //person speaking here is the administration councler
    System.out.println("Welcome to Hogwarts, the school for the best wizards and witches.");
    System.out.println("");
    System.out.println("Here we have many exciptional students.");



    Student Potter = new Student("Harry Potter", 16, "Gryffindor");

    Student Granger = new Student("Hermonie Granger", 16, "Gryffindor");

    Student Weasley = new Student("Ron Weasley", 16, "Gryffindor");

    Student Malfoy = new Student("Draco Malfoy", 16, "Slytherin");

    Student Diggory = new Student("Cedric Diggory", 17,"HufflePuff" );

    Student Lovegood = new Student("Luna Lovegood", 16, "Ravenclaw");

    Student Arranza = new Student("Chloe Arranza", 16, "Slytherin");

    //and the administration councler says""
    System.out.println("Actually, if you would like to talk to a student, I can call them in.");
    System.out.println("");
    System.out.println("These are the students that are currently in at the moment: ");

    //this is the array list of all the students user can talk to
    ArrayList<Student> listOfStudents = new ArrayList<Student>();
    listOfStudents.add(Potter);
    listOfStudents.add(Granger);
    listOfStudents.add(Weasley);
    listOfStudents.add(Malfoy);
    listOfStudents.add(Diggory);
    listOfStudents.add(Lovegood);
    listOfStudents.add(Arranza);




    //loop to go through students
    for (int i = 0; i < listOfStudents.size(); i++){
      System.out.println(listOfStudents.get(i).getName());
    }

    //and the administration councler says""
    System.out.println("");
    System.out.println("Would you like me to call in a student?");


    Scanner newIn = new Scanner(System.in);
    String choice = newIn.nextLine();


    Boolean found = false;
    Student theStudent = new Student("Test", 0, "Test1");

    for (int i = 0; i < listOfStudents.size(); i++) {
     if (choice.equals(listOfStudents.get(i).getName())) {
       System.out.println("May " + choice + " come in please?");
       System.out.println("");
       System.out.println("");
       System.out.println( " Hello, would you like to know my age or house?");
       found = true;
       theStudent = listOfStudents.get(i);
       break;

     }
   }

   if (!found) {
    System.out.println("Sorry, that student is not currently here.");
  }
  else {
    Scanner q = new Scanner(System.in);
    String question =  q.next();
    if (question.equals("age")) {
      System.out.println(theStudent.getName() + "\'s age is " + theStudent.getAge());
    }
    if (question.equals("house")){
      System.out.println(theStudent.getName() + "\'s house is " + theStudent.getHouse());
    }
  }

  //some dialog to transition from names to subjects
  System.out.println("");
  System.out.println("");
  System.out.println("  Want to know about my classes too?");
  System.out.println("");
  System.out.println("Oh, that's a great idea! Yes, which classes are you in " + choice + "?");
  System.out.println("");
  System.out.println("  I am in:");


  Subject Potions = new Subject("Potions","Harry, Hermonie, Ron, Draco, Cedric, Luna, and Chloe", "Severus Snape");
  Subject Creatures = new Subject("Mystical Creatures","Harry, Hermonie, Ron, and Draco", "Rubeus Hagrid");
  Subject Herbology = new Subject("Herbology","Harry, Hermonie, Ron, Draco, Cedric, Luna, and Chloe", "Pomona Sprout");
  Subject Apprition = new Subject("Apprition", "Harry, Hermonie, Ron, Draco, and Chloe", "Wikie Twycross");
  Subject MuggleStudies = new Subject("Muggle Studies","Chloe", "Mr. Burns" );
  Subject DarkArts = new Subject("Dark Arts", "Harry, Draco, Cedric, and Luna", "Severus Snape");

  ArrayList<Subject> listOfSubject = new ArrayList<Subject>();
  listOfSubject.add(Potions);
  listOfSubject.add(Creatures);
  listOfSubject.add(Herbology);
  listOfSubject.add(Apprition);
  listOfSubject.add(MuggleStudies);
  listOfSubject.add(DarkArts);

  for (int y = 0; y < listOfSubject.size(); y++){
    System.out.println(listOfSubject.get(y).getSubject());
  }

  System.out.println("Which class would you like to know more about?");
  Scanner pencil = new Scanner(System.in);
  String cry = pencil.nextLine();

  if (cry.equals("Potions")) {
    
  }



  System.out.println("Alright, would you you like to know names or teacher?");
  Scanner duck = new Scanner(System.in);
  String hello = duck.nextLine();

  Boolean nope = false;
  Subject theSubject = new Subject("something", "something1", "something2");

  for (int y = 0; y < listOfSubject.size(); y++) {
   if (hello.equals(listOfSubject.get(y).getNames())) {

     found = true;
     theSubject = listOfSubject.get(y);
     break;

   }
 }

 if (!found) {
  System.out.println("Sorry, that is not a subject avaliable here.");
}
else {

  Scanner e = new Scanner(System.in);
  String jeeze =  e.next();
  if (jeeze.equals("names")) {
    System.out.println(theSubject.getNames() + " enrolled students are "+ theSubject.getNames());
  }
  if (jeeze.equals("teacher")){
    System.out.println(theSubject.getNames() + "'s teacher is " + theSubject.getTeacher());
  }

  System.out.println("Hope you learned more about Hogwarts, have a great day!");
}

  }


}
