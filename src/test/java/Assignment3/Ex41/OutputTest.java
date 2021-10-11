package Assignment3.Ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputTest {
    @Test
    void countNamesTest1TrueIfPasses() {
        Output op = new Output();

        int expected = 9;
        int actual = op.CountNames();
        assertEquals(expected,actual);
    }
    @Test
    void countNamesTest2TrueIfFail() {
        Output op = new Output();

        int expected = 0;
        int actual = op.CountNames();
        assertEquals(expected,actual);
    }
    @Test
    void countNamesTest3TrueIfFail() {
        Output op = new Output();

        int expected = 10;
        int actual = op.CountNames();
        assertEquals(expected,actual);
    }


}