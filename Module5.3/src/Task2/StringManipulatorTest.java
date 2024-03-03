package Task2;

import org.junit.jupiter.api.Test;

public class StringManipulatorTest {
    @Test
    void concatenate() {
        //Test the concatenate method.
        StringManipulator sm = new StringManipulator();
        assert sm.concatenate("Hello", "World").equals("HelloWorld");
        assert sm.concatenate("This is a test", " for concatenation").equals("This is a test for concatenation");
    }
    @Test
    void findLength() {
        //Test the findLength method.
        StringManipulator sm = new StringManipulator();
        assert sm.findLength("Hello") == 5;
        assert sm.findLength("This is a test for length") == 25;
    }
    @Test
    void convertToUpperCase() {
        //Test the convertToUpperCase method.
        StringManipulator sm = new StringManipulator();
        assert sm.convertToUpperCase("Hello").equals("HELLO");
        assert sm.convertToUpperCase("This is a test for upper case").equals("THIS IS A TEST FOR UPPER CASE");
    }
    @Test
    void convertToLowerCase() {
        //Test the convertToLowerCase method.
        StringManipulator sm = new StringManipulator();
        assert sm.convertToLowerCase("HELLO").equals("hello");
        assert sm.convertToLowerCase("This is a test for lower case").equals("this is a test for lower case");
    }
    @Test
    void containsSubString() {
        //Test the containsSubString method.
        StringManipulator sm = new StringManipulator();
        assert sm.containsSubString("Hello", "ell");
        assert sm.containsSubString("This is a test", "a t");
    }
}
