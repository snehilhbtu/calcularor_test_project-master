package demo.advance.conditional_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;

import static org.junit.jupiter.api.condition.JRE.*;

public class Java_Runtime {
    @Test
    @EnabledOnJre(JAVA_8)
    void onlyOnJava8() {
        System.out.println("Test");
    }

    @Test
    @EnabledForJreRange(min = JAVA_9, max = JAVA_15)
    void fromJava9to11() {
        System.out.println("Test");
    }
}
