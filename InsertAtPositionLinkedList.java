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
public class InsertAtPosition{
    public static void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static Node insertPos(Node head, int element, int k){
        if(head == null){
            if(k == 1){
                return new Node(element);
            }else{
                return head;
            }
        }
        if(k == 1){
            return new Node(element, head);
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k-1){
                Node newNode = new Node(element);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        Node head = new Node(22);
        Node second =  new Node(32);
        Node third = new Node(42);
        Node fourth =  new Node(52);
        Node tail =  new Node(62);
        
        head.next = second;
        second.next = third;
        third.next= fourth;
        fourth.next = tail;
        
        print(head);
        head = insertPos(head, 100, 5);
        print(head);
    }
}
