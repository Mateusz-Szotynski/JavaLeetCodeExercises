package addTwoNumbers;


public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode greaterListNode = greaterListNode(l1, l2);
        ListNode smallerListNode = smallerListNode(l1, l2);
        smallerListNode = addZerosToSmallerNode(l1, Math.subtractExact(sizeOfListNode(greaterListNode), sizeOfListNode(smallerListNode)));

    }

    int sizeOfListNode(ListNode l) {
        int i = 1;
        while(l.next != null) i++;
        return i;
    }

    ListNode greaterListNode(ListNode l1, ListNode l2) {
        return sizeOfListNode(l1) >= sizeOfListNode(l2) ? l1 : l2;
    }

    ListNode smallerListNode(ListNode l1, ListNode l2) {
        return sizeOfListNode(l1) > sizeOfListNode(l2) ? l2 : l1;
    }

    ListNode addZerosToSmallerNode(ListNode l1, int numberOfZeros) {
        if (numberOfZeros > 0) {
            ListNode nodeToAdd = new ListNode(0);
            l1.next = addZerosToSmallerNode(nodeToAdd, numberOfZeros - 1);
        }
        return l1;
    }
}

