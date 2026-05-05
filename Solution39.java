import java.lang.classfile.components.ClassPrinter.ListNode;

public class Solution39 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // find length and tail
        int length = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // make circular
        tail.next = head;

        k = k % length;
        int stepsToNewTail = length - k - 1;

        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
