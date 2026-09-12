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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode temp = head;

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow;
        ListNode curr=head;
        if(fast == null){
            curr = slow;
        }
        else{
            curr = slow.next;
        }
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        while(prev!=null){
            if(temp.val != prev.val){
                return false;
            }
            temp = temp.next;
            prev = prev.next;
        }
        return true;
    }
}