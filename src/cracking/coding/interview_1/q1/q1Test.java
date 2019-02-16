package cracking.coding.interview_1.q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q1Test {
    private final q1 q1 = new q1();

    @Test
    void isUnique() {
        assertTrue(q1.isUnique("abc"));
        assertTrue(q1.isUnique("abcdefghijklmnopqrstuvwxyz"));
        assertTrue(q1.isUnique("abcdefghijklmnopqrstuvwxyz!@#$%^&*()_+-="));
        assertTrue(q1.isUnique("0123456789"));
        assertFalse(q1.isUnique("abcc"));
        assertFalse(q1.isUnique("Aabc"));
    }
}