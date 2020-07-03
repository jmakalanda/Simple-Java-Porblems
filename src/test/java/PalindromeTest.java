import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private String word;
    @Before
    public void setUp() throws Exception {
        this.word = "asdsa";
    }

    @Test
    public void isPalindrome() {

        System.out.println("is the word " +word +  " a Palindrome: " + new Palindrome().isPalindrome(word));
    }
}