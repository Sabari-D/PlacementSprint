import java.util.*;
public class Main{
    static void prime(int n, int i){
        if(i > n){
            return;
        }
        if(i >= 2 && isPrime(i, 2)){
            System.out.print(i+" ");
        }
        prime(n, i+1);
    }
    static boolean isPrime(int i, int d){
        if(d == i){
            return true;
        }
        if(i%d == 0){
            return false;
        }
        return isPrime(i, d+1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        prime(n, 1);
        
    }
}
