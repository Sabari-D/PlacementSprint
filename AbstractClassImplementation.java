import java.util.*;
abstract class Shape{
  String name;

  Shape(String name){
    this.name = name;
  }

  abstract double area(); //  abstract method - no body

  void display(){ // normal method
    System.out.println(name +" area = "+area());
  }
}

class Circle extends Shape{
  double r;
  Circle(double r){
    super("Circle");
    this.r = r;
  }
  @Override
  double area(){
    return 3.14 * r*r;
  }
}

class Rectangle extends Shape{
  double l, r;

  Rectangle(double l, double r){
    super("Rectangle");
    this.l = l;
    this.r = r;
  }

  @Override
  double area(){
    return  l * r;
  }
}



public class Main{
  public static void main(String[] args){
   // Shape s = new Shape("x"); // can't able to create object of abstract class

    Shape s1 = new Circle(5);
    Shape s2 = new Rectangle(4, 6);

    s1.display();
    s2.display();
  }
}
