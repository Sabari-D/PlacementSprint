import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data  = data;
        this.next  = null;
    }
    Node(int data, Node head){
        this.data =data;
        this.next = head;
    }
}
public class InsertToHead{
    public static void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static Node insert(Node head, int val){
        Node temp =  new Node(val, head);
        return temp;
    }
    public static void main(String[] args){
        Node head = new Node(43);
        Node second = new Node(53);
        Node third = new Node(63);
        Node fourth = new Node(73);
        Node tail = new Node(83);
        
        head.next= second;
        second.next = third;
        third.next =fourth;
        fourth.next = tail;
        
        print(head);
        head = insert(head, 100);
        print(head);
    }
}
