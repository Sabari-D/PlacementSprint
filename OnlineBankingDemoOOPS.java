import java.util.*;


abstract class Account{
  private String name;
  private double balance;

  Account(String name, double balance){
    this.name = name;
    this.balance = balance;
  }

  public String getName(){
    return name;
  }

  public double getBalance(){
    return balance;
  }

  public void deposit(double amount){
    if(amount > 0){
      balance += amount;
      System.out.println("Deposited :"+amount+" Balance : "+balance);
    }else{
      System.out.println("Invalid amount");
    }
  }

  public void withdraw(double amount){
    if(amount > 0 && amount <= balance){
      balance -= amount;
      System.out.println("withdraw : "+amount+" balance : "+balance);
    }
  }

  abstract double calculateInterest(); //abstraction + polymorphism
}

class SavingsAccount extends Account{
  SavingsAccount(String name, double balance){
    super(name, balance);
  }

  @Override
  double calculateInterest(){
    return getBalance() * 0.04;
  }
}

class LoanAccount extends Account{
  LoanAccount(String name, double balance){
    super(name, balance);
  }

  @Override
  double calculateInterest(){
    return getBalance() * 0.10;
  }
}
public class Main{
  public static void main(String[] args){
    Account a1 = new SavingsAccount("Sabari", 75000);
    Account a2 = new LoanAccount("Nithish", 54000);


    a1.deposit(2000);
    a1.withdraw(15000);
    a2.deposit(43000);
    a2.withdraw(43000);

    Account[] accounts = {a1, a2};
    for(Account a : accounts){
      System.out.println(a.getName() + " Interest : "+a.calculateInterest());
    }
  }
}
