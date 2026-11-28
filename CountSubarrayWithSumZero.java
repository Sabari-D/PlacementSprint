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
        map.put(0,1);
        
        int currentSum = 0;
        int count = 0;
       for(int val : arr){
            currentSum += val;
            
            count += map.getOrDefault(currentSum, 0);
            
            map.put(currentSum, map.getOrDefault(currentSum, 0)+1);
        }
        
        System.out.println(count);
    }
}
