import java.util.*;
public class Main{
  public static void main(String[] args){
    int a = 20;
    int b = 10;

    a= a^b^(b=a);
    System.out.println("a = "+a+" b = "+b);
  }
}
