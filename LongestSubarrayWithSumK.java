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

//********************************************************* BRUTE FORCE 2 (POSITIVES ONLY )***********************************************************
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


// ************************************************************* BETTER SOL (FOR ZEROES INCLUDING) ******************************************
// SOLVES FOR BOTH POSITIVES AND NEGATIVES AND ZEROES
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr =  Arrays.stream(scanner.nextLine().split(" "))
		            .mapToInt(Integer :: parseInt)
		            .toArray();
		            
		int k = scanner.nextInt();
		
	    Map<Long, Integer> prefixSum = new HashMap<>();
	    long sum = 0;
	    int maxLen = 0;
	    
	    for(int i=0; i<arr.length; i++){
	        sum += arr[i];
	        
	        if(sum == k){
	            maxLen = Math.max(maxLen, i+1);
	        }
	        
	        long rem = sum - k;
	        if(prefixSum.containsKey(rem)){
	            int len = i-prefixSum.get(rem);
	            maxLen = Math.max(maxLen, len);
	        }
	        
	        if(!prefixSum.containsKey(sum)){
	            prefixSum.put(sum, i);
	        }
	    }
	    
	    System.out.print(maxLen);
		
	}
}

//******************************************************* OPTIMAL SOL *********************************************************************************
// POSITVES AND ZEROES
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr =  Arrays.stream(scanner.nextLine().split(" "))
		            .mapToInt(Integer :: parseInt)
		            .toArray();
		            
		int k = scanner.nextInt();
		
	    int left = 0, right = 0;
	    int maxLen = 0;
	    int size = arr.length;
	    int sum = arr[0];
	    while(right < size){
	        while(left <= right && sum > k){
	            sum -= arr[left];
	            left++;
	        }
	        
	        if(sum == k){
	            maxLen = Math.max(maxLen, right-left+1);
	        }
	       
	        right++;
	        if(right < size) sum += arr[right];
	        
	    }
		System.out.print(maxLen);
	}
}

