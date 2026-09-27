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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);
        ListNode dummy1 = list1;
        ListNode dummy2 = list2;
        while(temp!=null){
            if(temp.val < x){
                dummy1.next = temp;
                dummy1 = dummy1.next;
            }
            else{
                dummy2.next = temp;
                dummy2 = dummy2.next;
            }
            temp = temp.next;
        }
        dummy1.next = list2.next;
        dummy2.next=null;

        return list1.next;
    }
}