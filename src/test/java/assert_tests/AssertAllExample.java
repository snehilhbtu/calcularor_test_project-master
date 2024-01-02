package assert_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertAllExample {

//    The assertAll method in JUnit 5 is used for grouping multiple assertions within a single test case.
//    This ensures that all assertions are executed, even if one of them fails.
    @Test
    void testMultipleAssertions() {
        String firstName = "John";
        String lastName = "Doe";
        int age = 30;

        // Grouped assertions using assertAll
        Assertions.assertAll(
                "Person Information",
                () -> Assertions.assertEquals("John", firstName, "First name does not match"),
                () -> Assertions.assertEquals("Doe", lastName, "Last name does not match"),
                () -> Assertions.assertEquals(30, age, "Age does not match")
        );
    }
}

