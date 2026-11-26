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
        int count = 0;
        for(int val : arr){
            int complement = target - val;
            
            if(map.containsKey(complement)){
                count += map.get(complement);
            }
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        System.out.print(count);
    }
}
