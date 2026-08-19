import java.util.*;

 class ListNode{
        int data;
        ListNode next;
        
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
        
        public ListNode(int data, ListNode next){
            this.data = data;
            this.next = next;
        }
        
        
    }
public class Main{
   public static void creationOfList(ListNode head){
       
       ListNode curr = head;
       while(curr != null){
           System.out.print(curr.data+" -> ");
           curr = curr.next;
       }
       System.out.print("null");
   }
	public static void main(String[] args) {
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        
        first.next = second;
        second.next = third;
        
        
        creationOfList(first);
	}
}
