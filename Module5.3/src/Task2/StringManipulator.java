package Task2;

public class StringManipulator {
    // For the purposes of testing the Test, the methods use built-in methods.
    // In another world, the methods would be implemented manually.
    public String concatenate(String str1, String str2){
        //Concatenates two input strings and returns the result.
        return str1 + str2;
    }
    public int findLength(String str){
        //Returns the length of the input string.
        return str.length();
    }
    public String convertToUpperCase(String str){
        //Converts the input string to upper case and returns the result.
        return str.toUpperCase();
    }
    public String convertToLowerCase(String str){
        //Converts the input string to lower case and returns the result.
        return str.toLowerCase();
    }
    public boolean containsSubString(String str, String subStr){
        //Checks if the input string contains the given substring and returns true if it does, otherwise returns false.
        return str.contains(subStr);
    }
}
