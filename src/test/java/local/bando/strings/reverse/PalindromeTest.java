package local.bando.strings.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void testPositive() {
        String str = "madam";
        assertTrue(Palindrome.isPalindrome(str));
    }

}