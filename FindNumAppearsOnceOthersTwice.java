//****************************************************** BRUTE FORCE *************************************************************
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = Arrays.stream(scanner.nextLine().split(" "))
		            .mapToInt(Integer :: parseInt)
		            .toArray();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int val : arr){
		    map.put(val, map.getOrDefault(val, 0)+1);
		}
		
		for(int val : map.keySet()){
		    if(map.get(val) == 1){
		        System.out.print(val);
		        break;
		    }
		}
	}
}



//**************************************************** OPTIMAL ******************************************************************************
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = Arrays.stream(scanner.nextLine().split(" "))
		            .mapToInt(Integer :: parseInt)
		            .toArray();
		
		int xor = 0;
		for(int val : arr){
		    xor = xor^val;
		}
		System.out.print(xor);
	}
}
