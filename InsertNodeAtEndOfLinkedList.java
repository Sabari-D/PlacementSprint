import java.util.*;
class Node{
    
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
    
    Node(int data, Node head){
        this.data = data;
        this.next = head;
    }
}
public class InsertToLast{
    public static void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static Node insertTail(Node head, int val){
        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args){
        Node head =new Node(23);
        Node second = new Node(33);
        Node third = new Node(43);
        Node fourth = new Node(53);
        Node tail =  new Node(63);
        
        head.next = second;
        second.next= third;
        third.next = fourth;
        fourth.next = tail;
        
        print(head);
        insertTail(head, 100);
        print(head);
        
    }
}
