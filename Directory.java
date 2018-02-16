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

    Student Granger = new Student("Hermione Granger", 16, "Gryffindor");

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
    System.out.println("Which student would you like me to call?");

    //scans to see answer
    Scanner newIn = new Scanner(System.in);
    String choice = newIn.nextLine();


    Boolean found = false;
    Student theStudent = new Student("Test", 0, "Test1");
    //getting student of choice
    for (int i = 0; i < listOfStudents.size(); i++) {
     if (choice.equals(listOfStudents.get(i).getName())) {
       System.out.println("May " + choice + " come in please?");
       System.out.println("");
       System.out.println("");
       //text with an indent means the student you chose is talking
       System.out.println( " Hello, would you like to know my age or house?");
       found = true;
       theStudent = listOfStudents.get(i);
       break;

     }
   }
   //if inserted name is wrong/non-existent
   if (!found) {
    System.out.println("Sorry, that student is not currently here.");
    System.exit(0);
  }
  else {
    //scans person and you can pick age or house (these are the answers)
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
  System.out.println("Oh, that's a great idea! What are the classes again " + choice + "?");
  System.out.println("");
  System.out.println("  Some of the classes are:");

  //subjects
  Subject Potions = new Subject("Potions","Harry, Hermonie, Ron, Draco, Cedric, Luna, and Chloe", "Severus Snape");
  Subject Creatures = new Subject("Mystical Creatures","Harry, Hermonie, Ron, and Draco", "Rubeus Hagrid");
  Subject Herbology = new Subject("Herbology","Harry, Hermonie, Ron, Draco, Cedric, Luna, and Chloe", "Pomona Sprout");
  Subject Apprition = new Subject("Apprition", "Harry, Hermonie, Ron, Draco, and Chloe", "Wikie Twycross");
  Subject MuggleStudies = new Subject("Muggle Studies","Chloe", "Mr. Burns" );
  Subject DarkArts = new Subject("Dark Arts", "Harry, Draco, Cedric, and Luna", "Severus Snape");

  //complete list of subjects
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

  //this section is complicated but every subject has another scanner to see if it is names or teachers
  System.out.println("Which class would you like to know more about?");
  Scanner pencil = new Scanner(System.in);
  String cry = pencil.nextLine();

  if (cry.equals("Potions")) {
    System.out.println("Alright, would you you like to know names or teacher?");
    //must answer with "names" or "teacher"
    Scanner duck = new Scanner(System.in);
    String hello = duck.nextLine();

    //then it prints out the answer
    if(hello.equals("names")){
      System.out.println(listOfSubject.get(0).getNames() + " are the students enrolled.");
    }
    if(hello.equals("teacher")){
      System.out.println(listOfSubject.get(0).getTeacher()+ " is the teacher for this class.");
    }
  }

    if (cry.equals("Mystical Creatures")) {
    System.out.println("Alright, would you you like to know names or teacher?");
    Scanner pen = new Scanner(System.in);
    String computer = pen.nextLine();

    if(computer.equals("names")){
      System.out.println(listOfSubject.get(1).getNames() + " are the students enrolled.");
    }
    if(computer.equals("teacher")){
      System.out.println(listOfSubject.get(1).getTeacher()+ " is the teacher for this class.");
    }
  }

  if (cry.equals("Herbology")) {
    System.out.println("Alright, would you you like to know names or teacher?");
    Scanner scisci = new Scanner(System.in);
    String hoho = scisci.nextLine();

    if(hoho.equals("names")){
      System.out.println(listOfSubject.get(2).getNames() + " are the students enrolled.");
    }
    if(hoho.equals("teacher")){
      System.out.println(listOfSubject.get(2).getTeacher()+ " is the teacher for this class.");
    }
  }

  //yes this is a long piece of code
  if (cry.equals("Apprition")) {
    System.out.println("Alright, would you you like to know names or teacher?");
    Scanner binder = new Scanner(System.in);
    String cup = binder.nextLine();

    if(cup.equals("names")){
      System.out.println(listOfSubject.get(3).getNames() + " are the students enrolled.");
    }
    if(cup.equals("teacher")){
      System.out.println(listOfSubject.get(3).getTeacher()+ " is the teacher for this class.");
    }
  }

  if (cry.equals("Muggle Studies")){
    System.out.println("Alright, would you you like to know names or teacher?");
    Scanner wawa = new Scanner(System.in);
    String haha = wawa.nextLine();

    if(haha.equals("names")){
      System.out.println(listOfSubject.get(4).getNames() + " are the students enrolled.");
    }
    if(haha.equals("teacher")){
      System.out.println(listOfSubject.get(4).getTeacher()+ " is the teacher for this class.");
    }
  }

  if (cry.equals("Dark Arts")){
    System.out.println("Alright, would you you like to know names or teacher?");
    Scanner omg = new Scanner(System.in);
    String imdone = omg.nextLine();

    if(imdone.equals("names")){
      System.out.println(listOfSubject.get(5).getNames() + " is/are the students enrolled.");
    }
    if(imdone.equals("teacher")){
      System.out.println(listOfSubject.get(5).getTeacher()+ " is the teacher for this class.");
    }
  }

  //finally, the ending
  System.out.println("Hope you were able to learn a few things about Hogwarts. Please come again!");
}
}
