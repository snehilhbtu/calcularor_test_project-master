package org.calculator.demos.division;

import org.calculator.division.Division;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionDemoTest {
    @Test
    public void test_integer_division(){
        {
            Division d=new Division();
            System.out.println(d.do_division(4, 2));
            assertEquals(2, d.do_division(4,2));
        }

    }

    @Test
    public void testIntegerDivision() {
        Division division = new Division();
        int result = division.do_division(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testLongDivision() {
        Division division = new Division();
        double result = division.do_division(15L, 3L);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testFloatDivision() {
        Division division = new Division();
        double result = division.do_division(7.5f, 2.5f);
        assertEquals(3.0, result, 0.0001);
    }


    @Test
    public void testLargeIntegerDivision() {
        Division division = new Division();
        // Large integer division, result should be 0
        int result = division.do_division(Integer.MAX_VALUE, Integer.MAX_VALUE + 1);
        assertEquals(0, result);
    }


    @Test
    public void testLargeLongDivision() {
        Division division = new Division();
        // Large long division, result should be 0.9999... (very close to 1)
        double result = division.do_division(Long.MAX_VALUE, Long.MAX_VALUE - 1);
        assertEquals(0.9999, result, 0.0001);
    }

    //@Test
    public void testNegativeIntegerDivision() {
        Division division = new Division();
        // Negative integer division, result should be -2
        int result = division.do_division(-10, 5);
        assertEquals(-2, result);
    }
    @Tag("Failed")
   // @Test
    public void testNegativeLongDivision() {
        Division division = new Division();
        // Negative long division, result should be -1.5
        double result = division.do_division(-15L, 10L);
        assertEquals(-1.5, result, 0.0001);
    }
}
