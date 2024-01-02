package org.calculator.demos.multiplication;

import org.calculator.multiplication.Multiplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationDemoTest {
    @Test
    public void test_integer_division(){
        {
            Multiplication d=new Multiplication();
            assertEquals(8, d.do_multiplication(4,2));
        }

    }
}