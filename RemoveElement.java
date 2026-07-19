import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = Arrays.stream(scanner.nextLine().split(" "))
		            .mapToInt(Integer :: parseInt)
		            .toArray();
		int x = scanner.nextInt();
		
		int j = 0;
		for(int i=0; i<arr.length; i++){
		    if(arr[i] != x){
		        arr[j] = arr[i];
		        j++;
		    }
		}
		for(int i=0; i<j; i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
