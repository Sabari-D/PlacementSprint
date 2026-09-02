import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
		    arr[i] =scanner.nextInt();
		}
		int target = scanner.nextInt();
		
		int left = 0;
		int currentSum = 0;
		int minLen = arr.length+1;
		for(int right = 0; right < arr.length; right++){
		    currentSum += arr[right];
		    while(currentSum > target){
		        minLen = Math.min(minLen, right-left+1);
		        currentSum -= arr[left];
		        left++;
		    }
		}
		if(minLen == arr.length+1){
		    System.out.println("Not Possible");
		}else{
		    System.out.println(minLen);
		}
	}
}
