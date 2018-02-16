/*
Chloe Arranza
Februrary 12, 2018
Student
*/

public class Student{

  private String name;
  private int age;
  private String house;

  public Student(String n, int a, String h) {

      this.name = n;
      this.age = a;
      this.house = h;

  }

  public String getName(){
      return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public String getHouse(){
    return this.house;
  }

  public void setName(String n) {
    name = n;
  }

  public void setAge(int a){
    age = a;
  }

  public void setHouse(String h){
    house = h;
  }
}
