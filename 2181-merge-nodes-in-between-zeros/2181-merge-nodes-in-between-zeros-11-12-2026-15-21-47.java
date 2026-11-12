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
    public ListNode mergeNodes(ListNode head) {
        ListNode res = head;
        ListNode temp = head.next;
        while(temp!=null){
            while(temp != null && temp.val == 0) temp = temp.next;
            int sum = 0;
            while(temp != null && temp.val!=0){
                sum+=temp.val;
                temp = temp.next;
            }
            if(temp!=null){
                res.next = new ListNode(sum);
                res = res.next;
                temp = temp.next;
            }
        }
        res.next = null;
        return head.next;
    }
}