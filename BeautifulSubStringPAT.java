import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		Map<String, Long> map = new HashMap<>();
		
		int countA = 0, countB = 0, countC = 0;
		long answer = 0;
		
		map.put("0#0", 1L);
		
		for(int i=0; i<input.length(); i++){
		    char ch = input.charAt(i);
		    
		    if(ch == 'a'){
		        countA++;
		    }else if(ch == 'b'){
		        countB++;
		    }else if(ch == 'c'){
		        countC++;
		    }
		    
		    
		    int diffAB = countA - countB;
		    int diffAC = countA - countC;
		    
		    String key = diffAB + "#" + diffAC;
		    
		    
		    answer += map.getOrDefault(key, 0L);
		    
		    map.put(key, map.getOrDefault(key, 0L)+1);
		}
		System.out.println(answer);
		
	}
}
