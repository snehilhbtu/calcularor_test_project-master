package assert_tests;

import org.calculator.users.Consumer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Assert_array_equals {
    @Test
    public void test_assert_array_equals() {
        Integer[] rohit_score_world_cup = {100, 50, 47, 0, 40};
        Integer[] kl_score_world_cup = {100, 50, 47, 0, 40};

        assertArrayEquals(rohit_score_world_cup,kl_score_world_cup);



        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        assertArrayEquals( a11, a12,"Should be equal");


    }

    @Test
    public void test_assert_array_equals_object() {

        StateFinancial[] India_a={
                new StateFinancial("Haryana","Gurugram"),
                new StateFinancial("UP","Noida")
        };

        StateFinancial[] India_b={
                new StateFinancial("Haryana","Gurugram"),
                new StateFinancial("UP","Noida")
        };


        StateFinancial[] US={
                new StateFinancial("Washington","Seattle"),
                new StateFinancial("California","LA")
        };

        assertArrayEquals(India_a,India_b);
    }
}

class StateFinancial{
    String state_name;
    String financial_capital;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateFinancial that = (StateFinancial) o;
        return Objects.equals(state_name, that.state_name) && Objects.equals(financial_capital, that.financial_capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state_name, financial_capital);
    }

    public StateFinancial(String state_name, String financial_capital) {
        this.state_name = state_name;
        this.financial_capital = financial_capital;
    }
}

//https://www.digitalocean.com/community/tutorials/java-equals-hashcode