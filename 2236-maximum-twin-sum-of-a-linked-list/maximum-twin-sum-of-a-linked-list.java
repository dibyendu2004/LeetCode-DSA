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
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int arr[] = new int[count];
        temp=head;
        int in=0;
        while(temp!=null){
            arr[in++] = temp.val;
            temp=temp.next;
        }

        int maxVal = 0;
        for(int i=0;i<count;i++){
            int sum = arr[i]+arr[count-1-i];
            maxVal = Math.max(maxVal,sum);
        }
        return maxVal;
    }
}