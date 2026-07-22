//******************************************** BRUTE FORCE ***************************************************************
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		
		int[] arr = new int[input.length];
		for(int i=0; i<arr.length; i++){
		    arr[i] = Integer.parseInt(input[i]);
		}
		
		
		int[] arr2 = Arrays.stream(scanner.nextLine().split(" "))
		            .mapToInt(Integer :: parseInt)
		            .toArray();
		            
	    int[] visted = new int[arr2.length];
	    
	    ArrayList<Integer> list = new ArrayList<>();
	    
	    for(int i=0; i<arr.length; i++){
	        for(int j=0; j<arr2.length; j++){
	            if(arr[i] == arr2[j] && visted[j] == 0){
                    list.add(arr[i]);
                    visted[j] = 1;
                    break;
	            }
	            
	            if(arr2[j] > arr[i]) break;
	        }
	    }
	    
	    for(int val : list){
	        System.out.print(val+" ");
	    }
	}
}



//*************************************************** OPTIMAL ***********************************************************

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().trim().split("\\s+");
		
		int[] arr = new int[input.length];
		for(int i=0; i<arr.length; i++){
		    arr[i] = Integer.parseInt(input[i]);
		}
		
		
		int[] arr2 = Arrays.stream(scanner.nextLine().split(" "))
		            .mapToInt(Integer :: parseInt)
		            .toArray();
		            
		            
		ArrayList<Integer> list = new ArrayList<>();
		            
	    int n1 = arr.length;
	    int n2 = arr2.length;
	    
	    int i=0, j=0;
	    
	    while(i < n1 && j < n2){
	        if(arr[i] < arr2[j]){
	            i++;
	        }
	        else if(arr2[j] < arr[i]){
	            j++;
	        }
	        else{
	            list.add(arr[i]);
	            i++;
	            j++;
	        }
	    }
	    for(int val : list){
	        System.out.print(val+" ");
	    }
	}
}
