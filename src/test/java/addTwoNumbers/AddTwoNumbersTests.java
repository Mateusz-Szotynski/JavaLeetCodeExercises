package addTwoNumbers;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AddTwoNumbersTests {

    @Test
    void addZeros() {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(8);
        solution.addZerosToSmallerNode(l2, Math.subtractExact(solution.sizeOfListNode(l1), solution.sizeOfListNode(l2)));
        assertAll(() -> {
            assertNotNull(l2);
            assertEquals(l2.next.val, 0);
            assertEquals(l2.next.next.val, 0);
        });
    }
}
