import java.util.*;


class Vehicle{
  String brand = "General";

  Vehicle(){
    System.out.println("Vehicle Constructor");
  }
  void start(){
    System.out.println("Vehicle is started");
  }
  }

  class Car extends Vehicle{
    String brand = "Toyota";
    Car(){
      super();
      System.out.println("Car Constructor");
    }

    void showBrand(){
      System.out.println("Child : "+brand+" Parent : "+super.brand);
    }

    @Override
    void start(){
      super.start();
      System.out.println("Car starts with key");
    }
  }


  class ElectricCar extends Car{
    void charge(){
      System.out.println("Electric car is charging");
    }
  }

  class Bike extends Vehicle{
    @Override 
    void start(){
      System.out.println("Bike start with a kick");
    }
  }
public class Main{
  public static void main(String[] args){
    Car c =  new Car();

    c.showBrand();
    c.start();

    System.out.println();

    ElectricCar e = new ElectricCar();

    e.charge();
    e.start();
    e.showBrand();

    System.out.println();

    Bike b = new Bike();
    b.start();

  }
}
