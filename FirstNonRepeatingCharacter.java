import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase();
        int[] freq =  new int[26];
        
        for(int i=0; i<input.length(); i++){
            freq[input.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<input.length(); i++){
            if(freq[input.charAt(i) - 'a'] == 1){
                System.out.print(input.charAt(i));
                return;
            }
        }
       
    }
}
