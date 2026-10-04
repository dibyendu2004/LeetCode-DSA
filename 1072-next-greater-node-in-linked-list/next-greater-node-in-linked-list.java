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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int[] ans = new int[count];

        temp = head;int i=0;
        while(temp!=null && temp.next!=null){
            int max = temp.val;
            ListNode curr = temp.next;
            while(curr!=null){
                if(curr.val>max){
                    max = curr.val;
                    break;
                }
                curr=curr.next;
            }
            if(temp.val == max){
                ans[i++] = 0;
            }
            else{
            ans[i++] = max;
            }
            temp=temp.next;
        }

        return ans;
    }
}