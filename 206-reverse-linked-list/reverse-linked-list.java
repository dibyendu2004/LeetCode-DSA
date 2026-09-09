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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode temp = head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }

        int arr[] = new int[len];
        ListNode temp1 = head;
        int i=0;
        while(temp1 != null){
            arr[i++] = temp1.val;
            temp1 = temp1.next;
        }

        ListNode temp2 = head;
        while(temp2!=null){
            temp2.val = arr[--len];
            temp2=temp2.next;
        }
        return head;
    }
}