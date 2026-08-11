import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();
        int k = scanner.nextInt();
        
        Map<Character, Integer> map = new HashMap<>();
        
        int left = 0, right = 0, maxLen = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            
            if(map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            if(map.size() <= k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        System.out.print(maxLen);
        
    }
}
