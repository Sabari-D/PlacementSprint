import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListCreation{
    public static Node userInput(){
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        
        Node head = null;
        Node tail = null;
        
        while(data != -1){
            Node newNode = new Node(data);
            
            
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
            
            data = scanner.nextInt();
        }
        return head;
    }
    
    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        Node head = userInput();
        printList(head);
    }
}
