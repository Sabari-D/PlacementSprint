import java.util.*;
class Node{
    
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main{
    
    public static void countList(Node head){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            System.out.print(current.data+" -> ");
            current  = current.next;
        }
        System.out.println("null");
        System.out.print(count);
    }
	public static void main(String[] args) {
		Node head = new Node(60);
		Node second = new Node(70);
		Node third = new Node(80);
		Node tail = new Node(97);
		
		head.next =second;
		second.next =  third;
		third.next = tail;
		
		
		countList(head);
	}
}
