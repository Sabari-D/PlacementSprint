import java.util.*;
public class Main{
  public static void main(String[] args){
    String input = "abababab";
    String target = "ab";
    int count = 0;

    for(int i=0; i<=input.length() - target.length(); i++){
      if(input.substring(i, i+target.length()).equals(target)){
        count++;
      }
    }
    System.out.println(count);
  }
}
