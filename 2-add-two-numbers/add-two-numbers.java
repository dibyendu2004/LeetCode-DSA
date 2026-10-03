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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // List<Integer> list1 = new ArrayList<>();
        // List<Integer> list2 = new ArrayList<>();

        // while(l1!=null){
        //     list1.add(l1.val);
        //     l1 = l1.next;
        // }

        // while(l2!=null){
        //     list2.add(l2.val);
        //     l2 = l2.next;
        // }

        // List<Integer> ans = new ArrayList<>();
        // int i=0,j=0,carry=0;
        // while(i<list1.size() || j<list2.size() || carry!=0){
        //     int sum = carry;

        //     if(i < list1.size()){
        //         sum += list1.get(i++);
        //     }

        //     if(j < list2.size()){
        //         sum += list2.get(j++);
        //     }

        //     ans.add(sum%10);
        //     carry = sum/10;
        // }

        // ListNode dummy = new ListNode(0);
        // ListNode curr = dummy;

        // for(int digit:ans){
        //     curr.next = new ListNode(digit);
        //     curr = curr.next;
        // }
        // return dummy.next;

        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int i=0,j=0,carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum = carry;

            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }

            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr=curr.next;
        }

        return dummy.next;
    }
}