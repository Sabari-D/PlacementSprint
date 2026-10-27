import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] arr = new int[size];
    for(int i=0; i<size; i++){
      arr[i] = scanner.nextInt();
    }

    for(int i=1; i<size; i++){
      int key = arr[i];
      int j = i-1;

      while(j >= 0 && arr[j] > key){
        arr[j+1] = arr[j];
        j--;
      }

      arr[j+1] = key;
    }

    System.out.println(Arrays.toString(arr));
  }
}
