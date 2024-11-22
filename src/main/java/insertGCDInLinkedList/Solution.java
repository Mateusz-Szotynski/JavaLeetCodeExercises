package insertGCDInLinkedList;

public class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;
        ListNode newNode = new ListNode(gcd(head.val, head.next.val));
        ListNode temp = head.next;
        head.next = newNode;
        newNode.next = temp;
        insertGreatestCommonDivisors(temp);
        return head;
    }

    private static int gcd(int a, int b) {
        if (a == 0) return b;
        else if (b == 0) return a;

        if (a >= b) return gcd(b, a % b);
        else return gcd(a, b % a);
    }
}
