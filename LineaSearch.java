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
		
		
		int target = scanner.nextInt();
		
		boolean isFound = false;
		for(int i=0; i<arr.length; i++){
		    if(arr[i] == target){
		        isFound = true;
		        System.out.print(i);
		        break;
		    }
		}
		if(!isFound){
		    System.out.print(-1);
		}
	}
}
