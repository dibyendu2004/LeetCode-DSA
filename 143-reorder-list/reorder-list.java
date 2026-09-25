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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;

        ListNode temp = newHead;
        ListNode prev = null;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            newHead = prev;
        }

        ListNode temp1 = head;
        ListNode temp2 = newHead;

        while(temp1 != null && temp2!=null){
            ListNode next1 = temp1.next;
            ListNode next2 = temp2.next;
            temp1.next = temp2;
            temp1.next.next = next1;
            temp1 = next1;
            temp2 = next2;
            
        }

    }
}