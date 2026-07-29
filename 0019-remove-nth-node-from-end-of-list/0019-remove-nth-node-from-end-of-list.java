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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size=0;
        
        ListNode temp=head;

        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==1){
         return head=null;
        }
        temp=head;
        int rem_index=size-n;
        if(rem_index==0){
            return head.next;
        }

        int pre=rem_index-1;
         int pres=0;

         while(temp!=null){
             if(pres==pre){
                temp.next=temp.next.next;
             }
             pres++;
             temp=temp.next;
         }
         return head;
        
        
        
    }
}