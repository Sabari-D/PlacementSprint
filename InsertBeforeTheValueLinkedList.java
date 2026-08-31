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
public class InsertBeforeValue{
    public static void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static Node insertBeforeTheValue(Node head, int element, int value){
        if(head == null) return null;
        
        if(head.data == value){
            return new Node(element, head);
        }
        
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == value){
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
        Node head = new Node(32);
        Node second = new Node(42);
        Node third = new Node(52);
        Node fourth =  new Node(62);
        Node tail = new Node(72);
        
        head.next = second;
        second.next =third;
        third.next = fourth;
        fourth.next= tail;
        
        print(head);
        head = insertBeforeTheValue(head, 100, 32);
        print(head);
    }
}
