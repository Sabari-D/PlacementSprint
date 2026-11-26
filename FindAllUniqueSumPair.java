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
        
        Set<Integer> set = new HashSet<>();
        Set<String> pair = new HashSet<>();
        
        for(int val : arr){
            int complement = target - val;
            if(set.contains(complement)){
                int first = Math.min(val, complement);
                int second = Math.max(val, complement);
                
                String pairKey = first+" , "+second;
            
            if(!pair.contains(pairKey)){
                System.out.print("("+first+","+second+")");
                pair.add(pairKey);
            }
            }
            set.add(val);
        }
        
        
    }
}
