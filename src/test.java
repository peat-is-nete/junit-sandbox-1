import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class test {

    @Test
    public void maxOfTwoNumbers() {
        float expected = 7f;
        float actual = HMWK.maxOfTwoNumbers(7f,4f);
        assertEquals(expected,actual,0);
    }

    @Test
    public void maxOfThree() {
        int expected = 21;
        int actual = HMWK.maxOfThree(7,12, 21);
        assertEquals(expected,actual,0);
    }

    @Test
    public void isCharacterAVowel() {
        boolean expected = false;
        boolean actual = HMWK.isCharacterAVowel('Y');
        assertSame(expected,actual);
    }

    @Test
    public void numOfArgument() {
        int expected = 7;
        int actual = HMWK.numOfArgument(1,2,3,4,5,6,7);
        assertSame(expected,actual);
    }

    @Test
    public void reverseString() {
        String expected = "etep";
        String actual = HMWK.reverseString("pete");
        assertEquals(expected,actual);
    }







}
