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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            head = null;
            return head;
        }
        int len =0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        n = len-n+1;
        if(n==1) return head.next;
        temp = head;
        ListNode prev = head;
        int i=0;
        while(i!=n-1){
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = temp.next;
        temp.next=null;
        return head;
    }
}