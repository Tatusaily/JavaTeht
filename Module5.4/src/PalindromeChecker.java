public class PalindromeChecker {
    boolean isPalindrome(String str) {
        // Step 1: Convert the string to lowercase
        str = str.toLowerCase();
        // Step 2: Remove punctuation and spaces. i.e. Allow only alphanumeric characters.
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        // Step 3: Compare the string with its reverse
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}
