//*********************************************************** BRUTE FORCE ****************************************************************************
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr =  Arrays.stream(scanner.nextLine().split(" "))
		            .mapToInt(Integer :: parseInt)
		            .toArray();
		            
		int target = scanner.nextInt();
		
		int maxLen = 0;
		for(int i=0; i<arr.length; i++){
		    for(int j=i; j<arr.length; j++){
		        int sum = 0;
		        for(int k=i; k<=j; k++){
		            sum += arr[k];
		        }
		        if(sum == target){
		                maxLen = Math.max(maxLen, j-i+1);
		        }
		    }
		}
		System.out.print(maxLen);
	}
}

//********************************************************* BRUTE FORCE 2 ***********************************************************
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr =  Arrays.stream(scanner.nextLine().split(" "))
		            .mapToInt(Integer :: parseInt)
		            .toArray();
		            
		int target = scanner.nextInt();
		
		int maxLen = 0;
		for(int i=0; i<arr.length; i++){
		     int sum = 0;
		    for(int j=i; j<arr.length; j++){
		        sum += arr[j];
		        
		        if(sum == target){
		                maxLen = Math.max(maxLen, j-i+1);
		        }
		    }
		        
		 }
		System.out.print(maxLen);
		
	}
}

