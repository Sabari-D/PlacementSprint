import java.util.*;
public class Main{
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sabari");
        map.put(2, "Murugan");
        map.put(3, "Nithish");
        map.put(2, "Senthil");
        
        System.out.println(map.get(2));
        System.out.println(map.containsKey(3));
        
        System.out.println();
        
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
