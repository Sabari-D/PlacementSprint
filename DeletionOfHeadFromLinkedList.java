import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class HeadDeletionOfLL{
    public static void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
        
    }
    
    public static Node remove(Node head){
        Node current = head;
        if(current == null) return head;
        
        head = head.next;
        return head;
        
    }
    public static void main(String[] args){
        Node head = new Node(50);
        Node second = new Node(60);
        Node third = new Node(70);
        Node fourth = new Node(80);
        Node fifth = new Node(90);
        Node tail = new Node(100);
        
        head.next= second;
        second.next = third;
        third.next= fourth;
        fourth.next = fifth;
        fifth.next = tail;
        
        print(head);
        head = remove(head);
        print(head);
    }
}
