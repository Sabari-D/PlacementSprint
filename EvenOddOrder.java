import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		
		String[] input = scanner.nextLine().split(" ");
		
		for(String s : input){
		    list.add(Integer.parseInt(s));
		}
		
		for(int val : list){
		    if(val % 2 == 0) res.add(val);
		}
		for(int val : list){
		    if(val % 2 != 0) res.add(val);
		}
		
		System.out.print(res);
		
	}
}
