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
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode res = head;
        while(res!=null && res.next!=null){
            int a = res.val;
            int b = res.next.val;

            ListNode gcd = new ListNode(findGCD(a,b));
            gcd.next = res.next;
            res.next = gcd;
            res = gcd.next;
        }
        return head;
    }
}