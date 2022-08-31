package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to22then2() {
        double expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to24then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 3);
        Point b = new Point(2, 4);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when56to11then6dot40() {
        double expected = 6.40;
        Point a = new Point(5, 6);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

}