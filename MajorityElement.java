import java.util.Scanner;

public class MajorityElement {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }

        int count = 0, major = 0;

        for(int val : arr){
            if(count == 0){
                major = val;
            }
            if(val == major){
                count++;
            }else{
                count--;
            }
        }
        
        count = 0;
        for(int val : arr){
            if(val == major){
                count++;
            }
        }
        
        if(count > arr.length/2){
            System.out.println(major);
        }else{
            System.out.println("No majority element");
        }
       
    }
}
