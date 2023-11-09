package org.example;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;

            if (l1!= null) {
                sum+=l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum+=l2.val;
                l2 = l2.next;
            }
            if (carry != 0) {
                sum+= carry;
            }

            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carry = sum / 10;
        }
        return dummy.next;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
