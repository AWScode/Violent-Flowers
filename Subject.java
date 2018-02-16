/*
Chloe Arranza
Februrary 14, 2018
Subject.java
*/

public class Subject{

  private String subject;
  private String names;
  private String teacher;


  public Subject(String s, String w, String t) {

    this.subject = s;
    this.names = w;
    this.teacher = t;
  }

  public String getSubject(){
    return this.subject;
  }
  public String getNames(){
    return this.names;
  }

  public String getTeacher(){
    return this.teacher;
  }

  public void setSubject(String s) {
    subject = s;
  }

  public void setNames(String w){
    names = w;
  }

  public void setTeacher(String t){
    teacher = t;
  }
}
