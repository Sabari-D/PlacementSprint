class Calculator{
  int add(int a, int b){
    return a+b;
  }

  int add(int a, int b, int c){
    return a+b+c;
  }
  double add(double a, double b){
    return a+b;
  }
}


class Animal{
  void sound(){
    System.out.println("Animal makes sound");
  }

}
class Dog extends Animal{
  @Override
  void sound(){
    System.out.println("Dog barks");
  }
}

class Cat extends Animal{
  @Override
  void sound(){
    System.out.println("Cat meows");
  }
}



public class Main{
  public static void main(String[] args){

    //For method overloading
    Calculator cal = new Calculator();
    System.out.println(cal.add(5,7));
    System.out.println(cal.add(2,5,7));
    System.out.println(cal.add(2.5, 3.4));


   // For method overriding
    Animal a = new Dog(); // parent ref and child Object
    a.sound();
     a = new Cat();
     a.sound();

  }
}
