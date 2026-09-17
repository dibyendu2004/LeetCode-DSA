/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return head;
        // Map<ListNode,Boolean> map = new HashMap<>();
        // ListNode temp = head;
        // ListNode ans = new ListNode(0);
        // while(temp != null){         
        //     if(map.get(temp)==true){
        //         ans.next = temp;
        //         break;
        //     }
        //     else{
        //         map.put(temp,true);
        //     }
        //     temp = temp.next;
        // }
        // return ans.next;

        ListNode slow = head , fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}