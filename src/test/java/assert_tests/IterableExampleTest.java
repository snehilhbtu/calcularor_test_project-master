package assert_tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;


/*the assertIterableEquals method to assert that two iterables contain the same elements in the same order
In this example, assertIterableEquals is used to assert that the expectedList and actualList contain the same elements in the same order.
If there is any difference in the elements or their order, the test will fail.
assertIterableEquals works with any iterable, not just lists. You can use it with sets, queues, and other iterable types as well.
*/
public class IterableExampleTest {

    @Test
    void testIterableEquality() {
        List<String> expectedList = Arrays.asList("apple", "banana", "cherry");
        List<String> actualList = Arrays.asList("apple", "banana", "cherry");

        // Assert that the iterables are equal
        assertIterableEquals(expectedList, actualList);
    }

    //@Test
    void testIterableEquality_fail() {
        List<String> expectedList = Arrays.asList("banana","apple", "cherry");
        List<String> actualList = Arrays.asList("apple", "banana", "cherry");

        // Assert that the iterables are equal
        assertIterableEquals(expectedList, actualList);
    }
}

