package demo.advance.conditional_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

class ExternalCustomConditionDemo {

    @Test
    @EnabledIf("conditional_test.ExternalCondition#customCondition")
    void enabled() {
        System.out.println("Test");
    }

}

class ExternalCondition {

    static boolean customCondition() {
        return true;
    }

}
