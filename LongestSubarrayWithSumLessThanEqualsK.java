import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = Arrays.stream(scanner.nextLine().split(" "))
		            .mapToInt(Integer :: parseInt)
		            .toArray();
		
		int k = scanner.nextInt();
		
		int left = 0, right= 0, sum = 0, maxSum = 0;
		
		while(right < arr.length){
		    sum += arr[right];
		    while(sum > k && left <= right){
		        sum -= arr[right];
		        left++;
		    }
		    if(sum <= k){
		        maxSum = Math.max(maxSum, right-left+1);
		    }
		    right++;
		}
		System.out.print(maxSum);
	}
}
