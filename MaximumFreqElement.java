import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        
        int maxElement = arr[0];
        int maxFreq = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        
        System.out.print(maxElement+" -> "+maxFreq);
    }
}
