import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0; i<size2; i++){
          arr2[i] = scanner.nextInt();   
        }
        
        if(size != size2){
            System.out.println("Arrays are not equal");
            return;
        }
        int[] freq = new int[100];
        
        
        for(int i=0; i<size; i++){
            freq[arr[i]]++;
            freq[arr2[i]]--;
        }
        
        
        boolean isEqual = true;
        for(int i=0; i<100; i++){
            if(freq[i] != 0){
                isEqual = false;
                break;
            }
        }
        if(isEqual){
            System.out.println("Arrays are equal..");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}
