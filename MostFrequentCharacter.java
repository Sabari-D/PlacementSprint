import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase();
       Map<Character, Integer> map = new HashMap<>();
       for(char ch : input.toCharArray()){
           map.put(ch, map.getOrDefault(ch, 0)+1);
       }
       
       
       int maxChar = input.charAt(0);
       int maxCount = 0;
       
       for(Map.Entry<Character, Integer> entry : map.entrySet()){
           if(entry.getValue() > maxCount){
               maxCount = entry.getValue();
               maxChar = entry.getKey();
           }
       }
       System.out.print((char)maxChar);
       
    }
}
