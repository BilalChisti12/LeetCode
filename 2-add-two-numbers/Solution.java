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
        int l1c = 0;
        int l2c = 0;
        ListNode l1h = l1, l2h = l2;
        while(l1h != null){
            l1c++;
            l1h = l1h.next;
        }
        while(l2h != null){
            l2c++;
            l2h = l2h.next;
        }
        ListNode tothd = l2 ;
        ListNode sm = l1;
        if(l1c > l2c){
            tothd = l1;
            sm = l2;
        }
        ListNode res = tothd;
        int carry =0;
        while(tothd!=null){
            int sum = carry + tothd.val;
            if(sm!=null){
                sum+=sm.val;
            }
            tothd.val = sum%10;
            carry = sum/10;
            if(tothd.next == null && carry > 0){
                tothd.next = new ListNode(carry);
                break;
            }

            tothd = tothd.next;
            if(sm!=null){
                sm = sm.next;
            }
            
        }
        return res;
    }
}