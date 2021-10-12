package Assignment3.Ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAndReplaceTest {

    @Test
    void replace() {

     FindAndReplace fr = new FindAndReplace();

     String expected;
        expected = "replacement done";
        String actual = fr.Replace();
     assertEquals(expected,actual);

    }
    @Test
    void replaceTestIfFalse() {
        FindAndReplace fr = new FindAndReplace();
        String expected;
        expected = "null";
        String actual = fr.Replace();
        assertNotEquals(expected,actual);

    }
}