import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0; i<size2; i++){
          arr2[i] = scanner.nextInt();   
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        
        for(int val : arr2){
            if(map.getOrDefault(val, 0) > 0){
                System.out.print(val+" ");
                map.put(val, map.get(val) - 1);
            }
            
        }
    }
}
