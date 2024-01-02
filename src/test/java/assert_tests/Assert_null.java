package assert_tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

import org.calculator.test.Testing;
import org.calculator.users.Consumer;
import org.junit.jupiter.api.Test;

public class Assert_null {
    @Test
    public void test_assert_null(){
        ArrayList<String> list=new ArrayList<>();
        list.add("SUM");
        list.add("Multiplication");
        Consumer user1=new Consumer("Sumit",40,20000F, list);
        assertNotNull(user1.getName());

        Consumer user2=new Consumer("Sumit",null,20000F, list);

        assertNull(user2.getAge());
        	
        Testing t=new Testing(null);
        
        assertNotNull(t.getA());
        
    }
}
