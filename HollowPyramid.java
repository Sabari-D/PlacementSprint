import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int size = scanner.nextInt();
      
      
      for(int i=1; i<=size; i++){
          for(int j=1; j<=size-i; j++){
              System.out.print(" ");
          }
          for(int k=1; k<=2*i-1; k++){
              if(k == 1 || k == 2*i-1 || i==size)
                System.out.print("*");
              else{
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
  }
}
