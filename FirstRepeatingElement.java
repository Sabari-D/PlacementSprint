import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        int[] freq = new int[100];
        
        for(int digit=0; digit<size; digit++){
            freq[arr[digit]]++;
        }
        
        for(int i=0; i<100; i++){
            if(freq[i] > 1){
                System.out.print(i+" -> "+freq[i]);
                break;
            }
        }
    }
}
