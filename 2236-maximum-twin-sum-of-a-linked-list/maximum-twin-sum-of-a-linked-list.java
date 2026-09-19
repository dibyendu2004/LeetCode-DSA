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
    public int pairSum(ListNode head) {
        // int count=0;
        // ListNode temp = head;
        // while(temp!=null){
        //     count++;
        //     temp=temp.next;
        // }
        // int arr[] = new int[count];
        // temp=head;
        // int in=0;
        // while(temp!=null){
        //     arr[in++] = temp.val;
        //     temp=temp.next;
        // }

        // int maxVal = 0;
        // for(int i=0;i<count;i++){
        //     int sum = arr[i]+arr[count-1-i];
        //     maxVal = Math.max(maxVal,sum);
        // }
        // return maxVal;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev = null;
        while(slow!=null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        int ans = 0;
        while(prev != null){
            ans = Math.max(ans,head.val + prev.val);
            head = head.next;
            prev = prev.next;
        }
        return ans;
    }
}