import java.util.*;
public class Main{
    private static int smallestMissingPositive(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int val : nums){
            set.add(val);
        }

        int missing = 1;
        while(set.contains(missing)){
            missing++;
        }
        return missing;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]= scanner.nextInt();
        }
        int res = smallestMissingPositive(arr);
        System.out.println(res);
    }
}
