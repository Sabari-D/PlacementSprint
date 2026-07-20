import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer :: parseInt)
                    .toArray();
                
        int max = arr[0];
        for(int val : arr){
            if(val > max){
                max = val;
            }
        }
        System.out.print(max);
    }
}
