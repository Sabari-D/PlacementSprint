import java.util.*;

class Student{
  int id;
  String name;
  double marks;

  Student(){ // Default Constructor
    this(0, "Unkonwn", 0.0);
    System.out.println("Default Constructor");
  }

  Student(int id, String name, double marks){ // Parameterized constructor
    this.id = id;
    this.name = name;
    this.marks = marks;
    System.out.println("Parameterized Constructor");
  }

  Student(Student s){ //Copy Constructor
    this.id = id;
    this.name = s.name;
    this.marks = s.marks;

    System.out.println("Copy Constructor");
  }

  void show(){
    System.out.println("id : "+id+" name : "+name+" marks : "+marks);
  }
}
public class Main{
  public static void main(String[] args){
      Student s1 = new Student();
      Student s2 = new Student(101, "Sabari", 84.3);
      Student s3 = new Student(s2);

      s1.show();
      s2.show();
      s3.show();
  }
}
