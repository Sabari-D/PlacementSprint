import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        String input = scanner.nextLine();
        String ctrl = scanner.nextLine();
        
        int[] freq = new int[26];
        
        for(char ch : input.toCharArray()){
            freq[ch - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : ctrl.toCharArray()){
            while(freq[ch - 'a'] > 0){
                sb.append(ch);
                freq[ch - 'a']--;
            }
        }
        
        if(sb.length() == 0){
            System.out.print("No kid");
        }else{
            System.out.print(sb);
        }
    }
}

