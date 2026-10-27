import java.util.*;

class InvalidAgeException extends Exception{
  public InvalidAgeException(String message){
    super(message);
  }
}
public class Main{
  //throws means this method might through an exception
  public static void checkEligibility(int age) throws InvalidAgeException{
      if(age < 18){
        // to explicitly trigger an exception 
        throw new InvalidAgeException("Access denied you must be 18 years old!!!");
      }else{
        System.out.println("Access Granted");
      }
  }
  public static void main(String[] args){
    try{
      System.out.println("Attempt to checking the eligibility!!!");
      checkEligibility(18);
    }
    catch(InvalidAgeException e){
      System.out.println("Caught an exception  : "+ e.getMessage());
    }

    finally{
      System.out.println("This clean up code always executes");
    }

    System.out.println("Program run smoothly after this block!!!");
  }
}
