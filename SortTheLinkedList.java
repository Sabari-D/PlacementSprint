import java.util.*;
public class Main{
  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
    }
  }

 static void sort(Node head){
  for(Node i=head; i!=null; i=i.next){
    for(Node j=i.next; j!=null; j=j.next){
      if(i.data > j.data){
        int temp = i.data;
        i.data = j.data;
        j.data = temp;
      }
    }
  }
 }


  static void print(Node head){
    for(Node n=head; n!=null; n=n.next){
      System.out.print(n.data+" ");
    }
    System.out.println();
  }

  public static void main(String[] args){
   Node head = new Node(30);
   head.next = new Node(10);
   head.next.next = new Node(32);
   head.next.next.next = new Node(45);

   System.out.println("Before : ");
   print(head);
   sort(head);

   System.out.println("After : ");
   print(head);

  }
}
