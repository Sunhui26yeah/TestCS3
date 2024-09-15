package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class oldVTest {

    @Test
    public void testSnippetWith1And10() {
        assertEquals(0, oldV.snippet(1, 10), "Testing with x=1 and y=10, should return 0");
    }

    @Test
    public void testSnippetWith2And10() {
        assertEquals(1000, oldV.snippet(2, 10), "Testing with x=2 and y=10, should return 1000");
    }

    @Test
    public void testSnippetWith1And5() {
        assertEquals(0, oldV.snippet(1, 5), "Testing with x=1 and y=5, should return 0");
    }

    @Test
    public void testSnippetWith2And15() {
        assertEquals(0, oldV.snippet(2, 15), "Testing with x=2 and y=15, should return 0");
    }

    @Test
    public void testSnippetWithMinus1And10() {
        assertEquals(0, oldV.snippet(-1, 10), "Testing with x=-1 and y=10, should return 0");
    }

    @Test
    public void testSnippetWithMinus2And20() {
        assertEquals(0, oldV.snippet(-2, 20), "Testing with x=-2 and y=20, should return 0");
    }

    @Test
    public void testSnippetWith0And10() {
        assertEquals(0, oldV.snippet(0, 10), "Testing with x=0 and y=10, should return 0");
    }

    @Test
    public void testSnippetWith0And20() {
        assertEquals(0, oldV.snippet(0, 20), "Testing with x=0 and y=20, should return 0");
    }
}
