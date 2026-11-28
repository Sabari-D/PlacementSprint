import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        
        int target = scanner.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        int currentSum = 0;
        int maxLen = 0;
       for(int i=0; i<size; i++){
           int val = arr[i];
            currentSum += val;
            
            int need = currentSum - target;
            if(map.containsKey(need)){
                int len = i - map.get(need);
                maxLen = Math.max(maxLen, len);
            }
            
            map.putIfAbsent(currentSum, i);
        }
        
        System.out.println(maxLen);
    }
}
