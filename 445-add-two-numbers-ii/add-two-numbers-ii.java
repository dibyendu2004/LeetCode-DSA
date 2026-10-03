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
        l1 = reverse(l1);
        l2 = reverse(l2);

        List<Integer> lst1 = new ArrayList<>();
        while(l1!=null){
            lst1.add(l1.val);
            l1 = l1.next;
        }

        List<Integer> lst2 = new ArrayList<>();
        while(l2!=null){
            lst2.add(l2.val);
            l2 = l2.next;
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

        return reverse(dummy.next);
    }

    public ListNode reverse(ListNode head){
        ListNode temp = head;

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