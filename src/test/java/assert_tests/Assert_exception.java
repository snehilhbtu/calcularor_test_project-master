package assert_tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class Assert_exception {
    @Test
    void exceptionTesting() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculator.divide(1, 0));
        System.out.println(exception);
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void testExceptionThrown() {
        // Assert that ArithmeticException is thrown when dividing by zero
        assertThrows(ArithmeticException.class, () -> {
            int result = 1 / 0; // This will throw ArithmeticException (division by zero)
        });
    }
}

class calculator {
    public static int divide(int i, int i1) {
        return i / i1;
    }
}
