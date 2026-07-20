import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer :: parseInt)
                    .toArray();
                
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        
        
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
