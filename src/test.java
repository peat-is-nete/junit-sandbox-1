import org.junit.Before;
import org.junit.jupiter.api.Test;
//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static java.time.Duration.ofSeconds;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;


public class test {

    @Test
    public void maxOfTwoNumbers() {
        float expected = 7f;
        float actual = HMWK.maxOfTwoNumbers(7f,4f);
        assertEquals(expected,actual,0);
    }

    @Test
    public void maxOfTwoNumbers2() {
        float expected = 7f;
        float actual = HMWK.maxOfTwoNumbers(7f,4f);
        assertEquals(expected,actual,0);

        assertAll("Check Numbers",
                () -> assertEquals(5f, HMWK.maxOfTwoNumbers(2f,5f)),
                () -> assertEquals(3f, HMWK.maxOfTwoNumbers(8f,10f))
        );
    }


//    @Test
//    void exceptionTesting() {
//        // set up user
//        Throwable exception = assertThrows(IllegalArgumentException.class, () -> HMWK.maxOfTwoNumbers(2, 3));
//        assertEquals("Age must be an Integer.", exception.getMessage());
//    }

    @Test
     void timeoutNotExceeded() {
        assertTimeout(ofSeconds(1L), () -> HMWK.maxOfTwoNumbers(2f,5f));
    }

    // if you have to check a return value

//    @Test
//    void timeoutNotExceededWithResult() {
//        String actualResult = assertTimeout(ofSeconds(1), () -> {
//            return restService.request(request);
//        });
//        assertEquals(200, request.getStatus());
//    }



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
