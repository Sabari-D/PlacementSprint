import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        
        for(int i=0; i<size; i++){
            int discount = 0;
            for(int j=i+1; j<size; j++){
                if(arr[j] <= arr[i]){
                    discount = arr[j];
                    break;
                }
            }
            System.out.print((arr[i] - discount)+" ");
        }
    }
}
