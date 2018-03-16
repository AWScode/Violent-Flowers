/*
Chloe Arranza
Computer Science
Library.java
*/
import java.util.*;

public class Library {

  public ArrayList<String> words;

  public Library() {
    this.words = new ArrayList<String>();

    //Sample
    words.add("once");
    words.add("upon");
    words.add("a");
    words.add("time");
    words.add("there");
    words.add("was");
    words.add("a");
    words.add("girl");
    words.add("who");
    words.add("lived");
    words.add("in");
    words.add("a");
    words.add("beautiful");
    words.add("castle");
    words.add("one");
    words.add("day");
    words.add("the");
    words.add("castle");
    words.add("there");
    words.add("fell");
    words.add("there");
    words.add("down");

  }

  //Sort with Insertion...
  //compare the unicode values of char at indexes of the words
  //so put a loop
  //next look at the first word and then translate it into unicode
  //after putting it in unicode, put it in another list
  //now look at the second word and translate it into unicode
  //compare the first word's unicode and the second word's unicode
  //put an if statement so that if the unicode is less than checked unicode, move to left of list
  // if the unicode is more than checked unicode, move to right of list
  //keep this list going until there is no more items in the list
  public void alphaSort(){

  }
  //Sort with Selection
  public ArrayList<String> void wLengthSort(){

    ArrayList<String> sortList = new ArrayList<String>();

    //create a temporary list to remove from
    ArryList<String> tempList = new ArrayList<Sting>();
    for(int h = 0; h < words.size(); h++) {
      tempList.add(words.get(h));
    }

    for (int y = 0; y < words.size(); y++){
        String min = tempList.get(0);

      for (int c = 0; c < words.size(); c++){
        if(min.length() > tempList.get(c).length()){
          min = tempList.get(c);
        }
      }
      tempList.remove(min);
      sortList.add(min);

    }

    return sortList;
  }

public void printList(ArrayList<String> printL){
  for(int i=0; i < printL.size(); i++)
}
  public int getWordCount(String w){
    int count = 0;
    for (int i = 0; i < words.size(); i++){
      if (words.get(i).equals(w)){
        count++;
      }
    }
    return count;
  }

  public ArrayList<String> getTopWords(){
    ArrayList<String> topWords = new ArrayList<String>();

    return topWords;
  }

public ArrayList<Strong> getWords(){
  return words;

}
  public static void main(String[] args) {

    Library myLib = new Library();

    System.out.println("\nWelcome to the AWS Library!");
    System.out.println("\nWe have compiled a list of the words for the book ___insert book here___: ");

    System.out.println("The Story: \n === \n\n");
    myLib.printList(myLib.getWords());
    System.out.println("\n");
    System.out.println("Here are the top words in the story");
    System.out.println("Word: a : " + Integer.toString(myLib.getWordCount("a")));
    System.out.println("Word: there : " + Integer.toString(myLib.getWordCount("there")));
    System.out.println("Word: castle : " + Integer.toString(myLib.getWordCount("castle")));
    System.out.println("Word: once : " + Integer.toString(myLib.getWordCount("once")));
    System.out.println("");
    myLib.printList(myLib.wLengthSort());
  }

}
