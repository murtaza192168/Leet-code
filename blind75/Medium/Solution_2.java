/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution_2 {
    public static void main(String[] args){
        // Give user input with two Linked Lists to be added
        // Invoke the function for execution
        // return the desired result here
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       // this dummy_head will point to the result ListNode 
       //create a new node
       ListNode dummy_head = new ListNode(0);
       ListNode current = dummy_head;
       int carry = 0;
       ListNode list1 = l1; ListNode list2 = l2;

       while(list1!=null || list2!=null){
           int l1_val = (list1!=null)?list1.val:0;
           int l2_val = (list2!=null)?list2.val:0;
           int sum = l1_val + l2_val + carry;
           carry = sum / 10;
           current.next = new ListNode(sum%10);
           current = current.next;

           // now move the pointer of l1 and l2 to next so that further addition of numbers can happen
            if(list1!=null){list1=list1.next;}
            if(list2!=null){list2=list2.next;}
       } 
       if(carry > 0){
           current.next = new ListNode(carry);
       }

       return dummy_head.next;

    }
}
