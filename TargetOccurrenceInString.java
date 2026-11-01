import java.util.*;
public class Main{
  public static void main(String[] args){
    String input = "java is easy and java java is powerful";
    String target = "java";
    int count = 0;

    String[] words = input.trim().split(" ");
    for(String word : words){
      if(word.equals(target)){
        count++;
      }
    }
    System.out.println(count);
  }
}
