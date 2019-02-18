package cracking.coding.interview_1.q3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class q3Test {
    private final q3 q3 = new q3();

    @Test
    void urlify() {
        assertEquals("abc", q3.urlify("abc  "));
        assertEquals("abc", q3.urlify(" abc  "));
        assertEquals("abc", q3.urlify(" abc"));
        assertEquals("a%20bc", q3.urlify(" a bc  "));
        assertEquals("a%20b%20c", q3.urlify(" a b c  "));
        assertEquals("ab%20c", q3.urlify(" ab c  "));
        assertEquals("Mr%20John%20Smith", q3.urlify("Mr John Smith "));
    }
}