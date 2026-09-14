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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        Set<ListNode> visited = new HashSet<>();
        while(temp != null){
           if(visited.contains(temp)) return true;
           else{
            visited.add(temp);
           }
            temp = temp.next;
        }
        return false;

        // ListNode slow = head,fast = head;
        // while(fast!=null && fast.next!=null){
        //     slow = slow.next;
        //     fast = fast.next.next;

        //     if(slow == fast) return true;
        // }
        // return false;
    }
}