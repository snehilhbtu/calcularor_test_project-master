package assert_tests;

import org.calculator.users.Consumer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Assert_Equal_Float {
    @Test
    public void test_assert_Float(){
        double d1 = 100.0, d2 = 99.99995;
        assertEquals(d1, d2, 0.0001,"Should be equal within delta.");
    }
}
