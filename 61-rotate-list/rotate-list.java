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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        int len = 1;
        ListNode curr1 = head;
        while(curr1.next != null){
            curr1 = curr1.next;
            len++;
        }
        k=k%len;
        if(k==0)return head;
        while(k-- > 0){
            ListNode temp = head;
            while(temp.next!=null){
                if(temp.next.next==null){
                ListNode curr = temp.next;
                temp.next = null;
                curr.next = head;
                head = curr;
                break;
                }else{
                    temp = temp.next;
                }
                
            }
        }
        return head;

        // if(head==null || head.next==null || k==0) return head;
        // int len = 1;
        // ListNode curr = head;
        // while(curr.next != null){
        //     curr = curr.next;
        //     len++;
        // }

        // k = k % len;
        // if(k==0) return head;

        // curr.next = head; // make circular

        // ListNode newCurr = head;
        // int steps = len - k;

        // for(int i=1;i<steps;i++){
        //     newCurr = newCurr.next;
        // }
        // ListNode newHead = newCurr.next;
        // newCurr.next = null;

        // return newHead;

        
    }
}