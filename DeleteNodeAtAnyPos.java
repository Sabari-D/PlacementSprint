import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteNodeAtAnyPos{
    
    public static void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current  = current.next;
        }
        System.out.println("null");
    }
    
    public static Node removeByK(Node head, int k){
        if(head == null) return head;
        
        int count = 0;
        Node temp = head;
        Node prev = null;
        
        while(temp != null){
            count++;
            
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        Node head = new Node(58);
        Node second = new Node(78);
        Node third = new Node(88);
        Node fourth = new Node(98);
        Node tail = new Node(108);
        
        head.next= second;
        second.next = third;
        third.next= fourth;
        fourth.next = tail;
        
        print(head);
        head = removeByK(head, 3);
        print(head);
    }
}
