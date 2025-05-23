package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTest {
    @Test
    public void testSumWithPositive() {
        int x = 10;
        int y = 20;
        int expected = 30;
        App app = new App();
        int actual = app.sum(x, y);
        assertEquals(expected, actual); 
    }
    
    @Test
    public void testSumWithNegative() {
        int x = -10;
        int y = -20;
        int expected = -30;
        App app = new App();
        int actual = app.sum(x, y);
        assertEquals(expected, actual); 
    }
    
    @Test
    public void testSumWithZero() {
        int x = 0;
        int y = 0;
        int expected = 0;
        App app = new App();
        int actual = app.sum(x, y);
        assertEquals(expected, actual); 
    }
}
