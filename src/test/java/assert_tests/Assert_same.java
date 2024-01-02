package assert_tests;

import org.calculator.users.Consumer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Assert_same {

    @Test
    public void test_assert_same(){
        ArrayList<String> list=new ArrayList<>();
        list.add("SUM");
        list.add("Multiplication");
        Consumer user1=new Consumer("Sumit",40,20000F, list);
        Consumer user2=new Consumer("Sumit",40,20000F, list);


        String s1=new String("Sumit");
        String s2=new String("Sumit");

        assertEquals(s1,s2);
        //assertSame(user1,user2);
        assertNotSame(user1,user2);
    }
}
