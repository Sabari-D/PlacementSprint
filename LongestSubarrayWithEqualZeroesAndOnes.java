import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        
        
        int currentSum = 0;
        int maxLen = 0;
        Map<Integer, Integer> map =  new HashMap<>();
        map.put(0, -1);
        
        for(int i=0; i<size; i++){
            currentSum += (arr[i] == 0) ? -1 : 1;
            
            if(map.containsKey(currentSum)){
                int len = i - map.get(currentSum);
                maxLen = Math.max(len, maxLen);
            }else{
                map.put(currentSum, i);
            }
            
            
        }
        System.out.println(maxLen);
    }
}
