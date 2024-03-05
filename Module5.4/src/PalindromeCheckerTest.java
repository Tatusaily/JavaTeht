import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("racecar"));
        assertTrue(checker.isPalindrome("RaceCar"));
        assertTrue(checker.isPalindrome("0110"));
        assertTrue(checker.isPalindrome(12321));
    }

}
