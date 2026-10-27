import java.util.*;
import java.util.regex.Pattern;
public class Main{

  public static final String regexpattern = "^[A-za-z0-9.%_+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
  public static final Pattern  right = Pattern.compile(regexpattern);
  public static void main(String[] args){
    String email1 = "sabari.123@gmail.com";
    String email2 = "sabari-email@com";

    System.out.println("The email "+ email1+" is valid ? : "+isValid(email1));
    System.out.println("The email "+ email2+" is valid ? : "+isValid(email2));

  }
    public static boolean isValid(String email){
      if(email == null){
        return false;
      }

      return right.matcher(email).matches();
    }
  
}
