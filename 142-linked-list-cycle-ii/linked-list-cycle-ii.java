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
        Map<ListNode,Boolean> map = new HashMap<>();
        ListNode temp = head;
        ListNode ans = new ListNode(0);
        while(temp != null){         
            if(map.containsKey(temp) && map.get(temp)==true){
                ans.next = temp;
                break;
            }
            else{
                map.put(temp,true);
            }
            temp = temp.next;
        }
        return ans.next;
    }
}