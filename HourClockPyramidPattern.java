import java.util.*;
import java.util.stream.*;

public class Main{
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int size = scanner.nextInt();
      
      for(int row=size; row>=1; row--){
          for(int space=1; space<=size-row; space++){
              System.out.print(" ");
          }
          for(int star=1; star<=2*row-1; star++){
              System.out.print("*");
          }
          System.out.println();
      }
      
      for(int i=2; i<=size; i++){
          for(int j=1; j<=size-i; j++){
              System.out.print(" ");
          }
          for(int k=1; k<=2*i-1; k++){
              System.out.print("*");
          }
          System.out.println();
      }
  }
}
