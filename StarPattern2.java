import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		for(int i=0; i<size; i++){
		    for(int j=i; j<size; j++){
		        System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}
