import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input = input.toLowerCase();
        
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : input.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
