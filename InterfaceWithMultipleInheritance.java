import java.util.*;


interface Payment{
  void pay(double payment); //public abstract by default

  default void receipt(){ // default method
    System.out.println("Receipt generated");
  }
}

class UPI implements Payment{
  public void pay(double amount){
    System.out.println("Paid "+amount+" using UPI");
  }
}

class CardPay implements Payment{
  public void pay(double amount){
    System.out.println("Paid "+amount+" using Card");
  }
}

// multiple inheritance through interface
interface Printable{
  void print();
}
interface Scannable{
  void scan();
}

class MultiFunctionPrinter implements Printable, Scannable{
  public void print(){
    System.out.println("Printing....");
  }
  public void scan(){
    System.out.println("Scanning...");
  }
}
public class Main{
  public static void main(String[] args){
    Payment p = new UPI();
    p.pay(500);
    p.receipt();
    p = new CardPay();
    p.pay(2100);


    MultiFunctionPrinter mfp = new MultiFunctionPrinter();
    mfp.print();
    mfp.scan();
  }
}
