import java.util.*;

class Student implements Comparable<Student>{
  int id;
  String name;


  public Student(int id, String name){
    this.id = id;
    this.name = name;
  }

  @Override
  public int compareTo(Student other){
    return Integer.compare(this.id, other.id);
  }

  @Override
  public String toString(){
    return "Student : id = "+ id +" name = "+name;
  }
}
public class Main{
  public static void main(String[] args){
    List<Student> students = new ArrayList<>();
    students.add(new Student(103, "Sabari"));
    students.add(new Student(102, "Nithish"));
    students.add(new Student(100, "Murugan"));

    System.out.println("Before sorting : "+ students);

    Collections.sort(students);
    System.out.println("After sorting : "+ students);
  }
}
