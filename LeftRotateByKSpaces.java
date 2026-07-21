import java.util.*;
public class Main
{
    private static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    private static void leftRotateByK(int[] nums, int k){
        k = k%nums.length; // k%=nums.length;
        
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        reverse(nums, 0, nums.length-1);
        
        for(int val : nums){
            System.out.print(val+" ");
        }
        
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		
		int[] arr = new int[input.length];
		for(int i=0; i<arr.length; i++){
		    arr[i] = Integer.parseInt(input[i]);
		}
		
		int k = scanner.nextInt();
		leftRotateByK(arr, k);
		
	}
}
