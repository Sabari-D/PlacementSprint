import java.util.*;
public class Main{
    public static String check(Object obj){
        if(obj instanceof String s){
            return "String's length : "+s.length(); 
        }
        
        return switch(obj){
            case Integer i when i>10 -> "Big Integer "+i;
            case Integer i           -> "Small Integer "+i;
            case Double d            -> "Decimal "+d;
            default                  -> "Unknown";
        };
    }
    public static void main(String[] args){
        System.out.println(check("Sabari"));
        System.out.println(1);
        System.out.println(12);
        System.out.println(2.7);
    }
}
