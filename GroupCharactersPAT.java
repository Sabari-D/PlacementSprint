import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String input = scanner.next();
		
		StringBuilder sb = new StringBuilder();
		sb.append(input.charAt(0));
		for(int i=1; i<input.length(); i++){
		    char prev = Character.toLowerCase(input.charAt(i-1));
		    char curr = Character.toLowerCase(input.charAt(i));
		    
		    int diff = curr-prev;
		    int direction = 0;
		    
		    if((diff == 1 || diff == -1) && (direction == 0 || direction == diff)){
		        sb.append(input.charAt(i));
		        direction = diff;
		    }else{
		        
		        System.out.println(sb);
		        sb = new StringBuilder();
		        sb.append(input.charAt(i));
		        direction = 0;
		    }
		}
		System.out.println(sb);
	}
}
