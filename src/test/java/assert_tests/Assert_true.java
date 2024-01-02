package assert_tests;

import org.calculator.users.Consumer;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Assert_true {

    @Test
    public void test_assert_true(){
        ArrayList<String> list=new ArrayList<>();
        list.add("SUM");
        list.add("Multiplication");
        //name age salary list
        Consumer user1=new Consumer("Sumit",40,20000F, list);
        assertTrue(user1.getAge()>35);
        assertTrue(user1.getAge()>35,"Age less than 40");
        assertFalse(user1.getName().contains("Ghosh"));
    }
}
