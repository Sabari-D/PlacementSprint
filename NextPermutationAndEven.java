import java.util.*;
public class Main
{
    private static boolean nextPermutation(char[] arr){
        int i = arr.length-2;
        
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }
        
        if(i < 0){
            return false;
        }
        
        int j = arr.length-1;
        while(arr[j] <= arr[i]){
            j--;
        }
        
        char temp = arr[i];
        arr[i] = arr[j];
         arr[j] = temp;
         
         
        reverse(arr, i+1, arr.length-1);
        return true;
    }
    
    public static void reverse(char[] arr, int left, int right){
        while(left <  right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char[] digits = input.toCharArray();
		
		while(nextPermutation(digits)){
		    int lastDigit = digits[digits.length-1] - '0';
		    
		    if(lastDigit % 2 == 0){
		        System.out.println(new String(digits));
		        return;
		    }
		}
		System.out.println(-1);
	}
}
