import java.util.*;
public class Main{
  public static void main(String[] args){
    int num = 1221;
    int reverse = 0;
    int temp = num;
    while(temp > 0){
      int digit = temp%10;
      reverse = reverse*10+digit;
      temp/=10;
    }

    if(num == reverse){
      System.out.println(num+" is a Palindrome");
    }else{
      System.out.println(num+" is not a Palindrome");
    }
  }
}
