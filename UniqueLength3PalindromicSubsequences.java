import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String input = scanner.next();
        
        int count = 0;
        for(char ch = 'a'; ch <= 'z'; ch++){
            int first = input.indexOf(ch);
            int second = input.lastIndexOf(ch);
            if(first == -1 || second-first < 2){
                continue;
            }
            
            
            Set<Character> set = new HashSet<>();
            for(int i=first+1; i<second; i++){
                set.add(input.charAt(i));
            }
            count += set.size();
        }
        System.out.print(count);
    }
}
