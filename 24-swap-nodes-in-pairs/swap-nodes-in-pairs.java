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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null && temp.next!=null){

            ListNode curr = temp.next;
            temp.next = curr.next;
            curr.next = temp;
            

            if(prev!=null){
                prev.next=curr;
            }else{
                head=curr;
            }

            prev = temp;
            temp=temp.next;
        }
        return head;
    }
}