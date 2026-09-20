import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
  Calculator calculator = new Calculator();
  int res = calculator.add(5, 6);
  System.out.print("Addition : "+res);
  System.out.println();


  int res2 = calculator.sub(20,7);
  System.out.print("Subtraction : "+res2);
  System.out.println();

  double res3 = calculator.mul(2, 7);
  System.out.println("Multiplication : "+res3);
  }
}
class Calculator{
  int add(int a, int b){
    return a+b;
  }

  int sub(int a, int b){
    if(a<b){
      return -1;
    }
    return a-b;
  }

  double mul(double a, double b){
    return a*b;
  }
}
