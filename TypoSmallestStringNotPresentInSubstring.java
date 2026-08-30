import java.util.*;
public class Main
{
    static String answer = null;
    public static boolean generate(StringBuilder current, int len, HashSet<String> set){
        if(current.length() == len){
            String val = current.toString();
            
            if(!set.contains(val)){
                answer = val;
                return true;
            }
        return false;
        }
        
        for(char ch = 'a'; ch<='z'; ch++){
            current.append(ch);
            if(generate(current, len, set)){
                return true;
            }
            current.deleteCharAt(current.length()-1);
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		for(int len=1; len<=4; len++){
		    HashSet<String> set =  new HashSet<>();
		    
		    for(int i=0; i<=input.length()-len; i++){
		        set.add(input.substring(i, i+len));
		    }
		    
		    answer = null;
		    
		    generate(new StringBuilder(), len, set);
		    
		    
		    if(answer != null){
		        System.out.println(answer);
		        return;
		    }
		}
	}
}
