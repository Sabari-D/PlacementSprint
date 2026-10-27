import java.util.*;

class Student{
  int id;
  String name;

  public Student(int id, String name){
    this.id = id;
    this.name = name;
  }


  @Override
  public String toString(){
    return "Student : id = "+id+" name = "+name;
  }
}
 
class NameComparator implements Comparator<Student>{
  @Override
  public int compare(Student s1, Student s2){
    return s1.name.compareTo(s2.name);
  }
}

public class Main{
  public static void main(String[] args){
    List<Student> students = new ArrayList<>();
    students.add(new Student(102, "Sabari"));
    students.add(new Student(103, "Nithish"));
    students.add(new Student(100, "Murugan"));

    System.out.println("Before sorting : "+ students);

    Collections.sort(students, new NameComparator());
    System.out.println("After sorting (By Name): "+ students);
  }
}
