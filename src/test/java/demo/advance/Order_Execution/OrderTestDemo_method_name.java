package demo.advance.Order_Execution;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
class OrderTestDemo_method_name {

    @Test
    void nullValues() {
        // perform assertions against null values
    }

    @Test
    void emptyValues() {
        // perform assertions against empty values
    }

    @Test
    void validValues() {
        // perform assertions against valid values
    }

}
