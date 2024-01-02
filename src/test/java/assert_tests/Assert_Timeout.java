package assert_tests;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;

//In JUnit 5, the assertTimeout method is used to test whether the execution of
//        a given block of code takes less time than the specified timeout.
//        This is useful for testing the performance of certain operations.

public class Assert_Timeout {
    @Test
    void testExecutionTime() {
        // Assert that the execution of the code block takes less than 100 milliseconds
        assertTimeout(Duration.ofMillis(100), () -> {
            // Simulate a time-consuming operation
            Thread.sleep(50); // Sleep for 50 milliseconds
        });
    }
}
