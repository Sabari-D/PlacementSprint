class Employee{
  private String name;
  private double salary;
  
  Employee(String name, double salary){
    this.name = name;
    this.salary = salary;
  }
  public void work(){
    System.out.println(name);
    System.out.println(salary);
    System.out.println("Employee is working...");
    // System.out.println("Employee Class Ended");
    System.out.println();
  }

  public String getName(){
    return name;
  }
  public double getSalary(){
    return salary;
  }
}




class Developer extends Employee{
  private String knownLanguage;
  Developer(String name, double salary, String knownLanguage){
    super(name, salary);

    this.knownLanguage = knownLanguage;
  }

  
  public void writeCode(){
    System.out.println("Developer is writing the code in "+ knownLanguage);

    System.out.println("Developer class Ended...");
     System.out.println();
  }
  @Override
  public void work(){
    System.out.println("Develper is working");
  }
  public String getLanguage(){
    return knownLanguage;
  }

}

class SeniorDeveloper extends Developer{
  private int teamSize;

  SeniorDeveloper(String name, double salary, String knownLanguage, int teamSize){
    super(name, salary, knownLanguage);
    this.teamSize = teamSize;
  }
  public int getTeam(){
    return teamSize;
  }
  public void designSystem(){
    System.out.println("Name : "+getName());
    System.out.println("Salary : "+getSalary());
    System.out.println("Known Language : "+getLanguage());
    System.out.println("Team Size : "+teamSize);
    System.out.println("Senior class Ended");
  }
  @Override
  public void work(){
    System.out.println("Senior Developer is designing and monitoring...");
  }

}

public class Main{
  public static void main(String[] args){
    Employee emp = new Employee("Sabari",100000);
    Employee emp2 = new Developer("Sabari", 100000, "Java");
    // SeniorDeveloper emp3 = new SeniorDeveloper("Sabari", 100000, "Java", 10);
     Employee emp3 = new SeniorDeveloper("Sabari", 100000, "Java", 10);

    // emp.work();
    // emp2.work();
    // SDE.designSystem();

    emp.work();
    emp2.work();
    emp3.work();

   
  }
}
