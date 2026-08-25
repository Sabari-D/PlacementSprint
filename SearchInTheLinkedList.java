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
        public static boolean searchList(Node head, int target){
            Node current  = head;
            while(current != null){
                if(current.data == target){
                    return true;
                }
                current = current.next;
            }       
            return false;
        }
        public static void main(String[] args){
            Node head = new Node(34);
            head.next = new Node(45);
            head.next.next = new Node(67);
            head.next.next.next = new Node(78);
            head.next.next.next = new Node(89);
            
            int target = 6;
            boolean isFound = searchList(head, target);
            
            if(isFound){
                System.out.print("Target present in the Linked List...");
            }else{
                System.out.print("Target not found in the Linked List...");
            }
        }
    }
