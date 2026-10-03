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
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode prev1 = null;
        while(temp1!=null){
            ListNode next = temp1.next;
            temp1.next = prev1;
            prev1 = temp1;
            temp1 = next;
        }

        ListNode prev2 = null;
        while(temp2!=null){
            ListNode next = temp2.next;
            temp2.next = prev2;
            prev2 = temp2;
            temp2 = next;
        }

        List<Integer> lst1 = new ArrayList<>();
        while(prev1!=null){
            lst1.add(prev1.val);
            prev1 = prev1.next;
        }

        List<Integer> lst2 = new ArrayList<>();
        while(prev2!=null){
            lst2.add(prev2.val);
            prev2 = prev2.next;
        }

        List<Integer> ans = new ArrayList<>();
        int i=0,j=0,carry=0;
        while(i<lst1.size() || j<lst2.size() || carry!=0){
            int sum = carry;

            if(i<lst1.size()){
                sum+=lst1.get(i++);
            }

            if(j<lst2.size()){
                sum+=lst2.get(j++);
            }

            ans.add(sum%10);
            carry = sum/10;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int n:ans){
            curr.next = new ListNode(n);
            curr=curr.next;
        }

        ListNode temp = dummy.next;
        ListNode prev = null;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}