import java.util.*;
public class Main{
  public static void main(String[] args){
    String s = "helloworld vanakkam";

    char[] ch = s.toCharArray();

    for(int i=0; i<ch.length; i++){
      if(ch[i] >= 'a' && ch[i] <= 'z'){
        ch[i] = (char)(ch[i] - 32);
      }
    }
    System.out.println(new String(ch));
  }
}
