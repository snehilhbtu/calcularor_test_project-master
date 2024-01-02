package org.calculator.demos.sum;

import static org.calculator.sum.Add.do_add;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddTest
{
    @DisplayName("A negative value for year is not supported by the leap year computation.")
    @Test
    void test_integer_add() {
        assertEquals(5, do_add(2,3));
    }

    @Test
    void test_add_lowest_int(){
        assertEquals(0, do_add(0,0));
    }

    @Test
    void test_add_highest_int(){
        int a=Integer.MAX_VALUE-1;
        int b=1;
        int c=a+b;
        System.out.println(c);
        assertEquals(c, do_add(a,b));

    }

}
