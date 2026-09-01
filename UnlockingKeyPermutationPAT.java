import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		char[] digits = input.toCharArray();
		
		Arrays.sort(digits);
		
		if(digits[0] == '0'){
		    int i = 0;
		    
		    while(i < digits.length && digits[i] == '0'){
		        i++;
		    }
		    
		    char temp = digits[0];
		    digits[0] = digits[i];
		    digits[i] = temp;
		}
		
		System.out.print(new String(digits));
	}
}
