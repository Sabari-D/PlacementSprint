import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size  = scanner.nextInt();
		int[] arr =  new int[size];
		
		for(int i=0; i<size; i++){
		    arr[i] = scanner.nextInt();
		}
		
		int target = scanner.nextInt();
		
		int left = 0, right = 0;
		int currentSum = 0;
		int maxSum = 0;
		while(right <  size){
		    currentSum += arr[right];
		    
		    if(currentSum > target){
		        currentSum -= arr[left];
		        left++;
		    }
		    
		    if(currentSum == target){
		        maxSum = Math.max(maxSum, right-left+1);
		    }
		    right++;
		}
		
		System.out.print(maxSum);
	}
}
