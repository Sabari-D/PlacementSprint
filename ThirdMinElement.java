import java.util.*;
public class ThirdSmallestMinimum {
    private static void thirdSmallest(int[] nums){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;
        if(nums.length < 3){
            System.out.println("Not Possible");
        }
        for(int val : nums){
            if(val < min){
                thirdMin = secondMin;
                secondMin = min;
                min = val;
            }else if(val < secondMin && val != min){
                thirdMin = secondMin;
                secondMin = val;
            }else if(val < thirdMin && val != secondMin && val !=min){
                thirdMin= val;
            }
        }
        if(thirdMin != Integer.MAX_VALUE){
            System.out.println(thirdMin);
        }
        else{
            System.out.println("No third smallest element");
        }

    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] =scanner.nextInt();
        }
        thirdSmallest(arr);

    }
}
