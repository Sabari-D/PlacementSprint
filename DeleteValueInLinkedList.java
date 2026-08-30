import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteTheValueInLinkedList{
    public static void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static Node removeElement(Node head, int element){
        if(head.data == element) return head;
        
        Node temp = head;
        Node prev = null;
        
        while(temp != null){
            if(temp.data == element){
            prev.next = prev.next.next;
            break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        Node head = new Node(45);
        Node second = new Node(55);
        Node third = new Node(65);
        Node fourth = new Node(75);
        Node tail =  new Node(85);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = tail;
        
        print(head);
        removeElement(head, 65);
        print(head);
    }
}
