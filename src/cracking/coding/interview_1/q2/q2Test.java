package cracking.coding.interview_1.q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q2Test {

    private final q2 q2 = new q2();

    @Test
    void checkPermutation() {
        assertFalse(q2.checkPermutation("abcc", "bcd"));
        assertTrue(q2.checkPermutation("abc", "bca"));
        assertFalse(q2.checkPermutation("abcd", "bca"));
        assertTrue(q2.checkPermutation("abccc", "bcacc"));
        assertFalse(q2.checkPermutation("abccc", "12345"));
        assertFalse(q2.checkPermutation("Abccc", "abccc"));
        assertTrue(q2.checkPermutation("Abccc", "Abccc"));
        assertFalse(q2.checkPermutation("000", "0"));
        assertFalse(q2.checkPermutation("  ", " "));
        assertTrue(q2.checkPermutation("  ", "  "));
    }
}