//************************************************* BRUTE FORCE ********************************************************************
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr =  Arrays.stream(scanner.nextLine().split(" "))
		             .mapToInt(Integer :: parseInt)
		             .toArray();
		             
		
		
		for(int i=1; i<=arr.length; i++){
		    boolean flag = false;
		    for(int j=0; j<arr.length-1; j++){
		        if(arr[j] == i){
		            flag = true;
		            break;
		        }
		    }
		    
		    if(!flag){
		        System.out.println(i);
		        return;
		    }
		}
	}
}

//*********************************************************** BETTER SOLUTION ************************************************************
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr =  Arrays.stream(scanner.nextLine().split(" "))
		             .mapToInt(Integer :: parseInt)
		             .toArray();
		             
		
		
		int[] hash = new int[arr.length+1];
		
		for(int i=0; i<arr.length-1; i++){
		    hash[arr[i]] = 1;
		}
		
		for(int i=1; i<=arr.length; i++){
		    if(hash[i] == 0){
		        System.out.print(i);
		        break;
		    }
		}
		
	}
}

//*************************************************************OPTIMAL SOLUTION ************************************************************

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr =  Arrays.stream(scanner.nextLine().split(" "))
		             .mapToInt(Integer :: parseInt)
		             .toArray();
		             
		//xor from 1 to n 
		int n = arr.length+1;
		int xorFull = 0, xorArray = 0;
		// for(int i=1; i<=n; i++){
		//     xorFull = xorFull ^ i;
		// }
		
		//xor elements in the array
		for(int i=0; i<arr.length-1; i++){
		    xorArray = xorArray ^ arr[i];
			xorFull = xorFull ^ (i+1);
		}
		xorFull = xorFull ^ arr.length-1;
	
		System.out.print(xorArray ^ xorFull);
	}
}
