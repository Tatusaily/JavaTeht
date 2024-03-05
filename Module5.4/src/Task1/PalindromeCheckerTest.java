package Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("racecar"));
        assertTrue(checker.isPalindrome("RaceCar"));
        assertFalse(checker.isPalindrome("hello"));
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(checker.isPalindrome("0110"));
        assertTrue(checker.isPalindrome(12321));
    }

}
