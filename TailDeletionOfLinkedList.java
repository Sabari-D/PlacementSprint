import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
    
}
public class TailDeletionOfLL{
    public static void print(Node head){
        Node current = head;
        while(current.next != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    public static Node removeTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        Node head = new Node(34);
        Node second = new Node(78);
        Node third = new Node(86);
        Node fourth = new Node(45);
        Node tail = new Node(58);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next= tail;
        
        print(head);
    }
}
