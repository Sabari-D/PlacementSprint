import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        
       Set<Integer> set = new HashSet<>();
       
       for(int val : arr)
       {
           set.add(val);
       }
       
       int longestStreak = 0;
       
       for(int val : set){
           if(!set.contains(val-1)){
               int currentNum = val;
               int currentStreak = 1;
           
           
           while(set.contains(currentNum + 1)){
               currentStreak++;
               currentNum++;
           }
           
           longestStreak = Math.max(currentStreak, longestStreak);
           }
       }
       System.out.println(longestStreak);
    }
}
