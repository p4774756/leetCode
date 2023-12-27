package org.example;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ln = new ListNode();
        ListNode start = ln;

        do {
            if (list1 == null && list2 == null) {
                break;
            }
            else if (list1 != null && list2 == null) {
                ln.next = new ListNode();
                ln = ln.next;
                ln.val = list1.val;
                list1 = list1.next;
            }
            else if (list1 == null && list2 != null) {
                ln.next = new ListNode();
                ln = ln.next;
                ln.val = list2.val;
                list2 = list2.next;
            }
            else {
                if (list1.val < list2.val) {
                    ln.next = new ListNode();
                    ln = ln.next;

                    ln.val = list1.val;
                    list1 = list1.next;
                } else {
                    ln.next = new ListNode();
                    ln = ln.next;

                    ln.val = list2.val;
                    list2 = list2.next;
                }
            }
        } while (list1 != null || list2 !=null);

        return start.next;
    }

    static public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
