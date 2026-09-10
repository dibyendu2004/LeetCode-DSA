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
        if(head == null) return head;
        ListNode temp = head;
        int len=0;
        while(temp != null){
            len++;
            temp=temp.next;
        }

        if(len == n) return head.next;
        ListNode temp1 = head;
        int count=0;
        while(temp1 != null){
            count++;
            if(count == (len-n)){
                temp1.next = temp1.next.next;
                break;
            }
            temp1 = temp1.next;
        }
        return head;
    }
}