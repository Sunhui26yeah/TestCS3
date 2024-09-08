package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class oldVTest {

    @Test
    public void testSnippet_XPositive_YEquals10_Returns1000() {
        // Case when x > 0 and y == 10, should return 1000
        assertEquals(1000.0, oldV.snippet(1, 10), 0.001);
        assertEquals(1000.0, oldV.snippet(2, 10), 0.001);
    }

    @Test
    public void testSnippet_XPositive_YNotEquals10_Returns0() {
        // Case when x > 0 and y != 10, should return 0
        assertEquals(0.0, oldV.snippet(1, 5), 0.001);
        assertEquals(0.0, oldV.snippet(2, 15), 0.001);
    }

    @Test
    public void testSnippet_XPositive_YEquals20_ReturnsNegative1000() {
        // Case when x > 0 and y == 20 (this case is covered by the else branch)
        assertEquals(-1000.0, oldV.snippet(-1, 20), 0.001);
        assertEquals(-1000.0, oldV.snippet(-2, 20), 0.001);
    }

    @Test
    public void testSnippet_XNegative_YAnyValue_Returns0() {
        // Case when x < 0 should always return 0
        assertEquals(0.0, oldV.snippet(-1, 10), 0.001);
        assertEquals(0.0, oldV.snippet(-2, 20), 0.001);
    }

    @Test
    public void testSnippet_XZero_YAnyValue_Returns0() {
        // Case when x == 0 should return 0 because x^3 = 0
        assertEquals(0.0, oldV.snippet(0, 10), 0.001);
        assertEquals(0.0, oldV.snippet(0, 20), 0.001);
    }
}
