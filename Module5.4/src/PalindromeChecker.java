public class PalindromeChecker {
    boolean isPalindrome(Object arg) {
        // Step 1: Convert the object to a string
        // This allows us to handle more than just strings, in case we want to.
        try {
            arg = arg.toString();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

        String str = arg.toString();
        // Step 2: Convert the string to lowercase
        str = str.toLowerCase();
        // Step 3: Remove punctuation and spaces. i.e. Allow only alphanumeric characters.
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        // Step 4: Compare the string with its reverse
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}
