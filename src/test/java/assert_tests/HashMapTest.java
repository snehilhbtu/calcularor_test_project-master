package assert_tests;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {

    @Test
    void testHashMapEquality() {
        // Creating HashMaps for testing
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("one", 1);
        expectedMap.put("two", 2);
        expectedMap.put("three", 3);

        Map<String, Integer> actualMap = new HashMap<>();
        actualMap.put("one", 1);
        actualMap.put("two", 2);
        actualMap.put("three", 3);

        // Assert that the HashMaps are equal
        assertEquals(expectedMap, actualMap);
    }

    @Test
    void testHashMapSize() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("key1", "value1");
        myMap.put("key2", "value2");

        // Assert that the HashMap has a specific size
        assertEquals(2, myMap.size());
    }

    @Test
    void testHashMapContainsKey() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("key1", "value1");
        myMap.put("key2", "value2");

        // Assert that the HashMap contains a specific key
        assertTrue(myMap.containsKey("key1"));
        assertFalse(myMap.containsKey("key3"));
    }

    @Test
    void testHashMapContainsValue() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("key1", "value1");
        myMap.put("key2", "value2");

        // Assert that the HashMap contains a specific value
        assertTrue(myMap.containsValue("value1"));
        assertFalse(myMap.containsValue("value3"));
    }

    @Test
    void testHashMapIsEmpty() {
        Map<String, String> emptyMap = new HashMap<>();

        // Assert that the HashMap is empty
        assertTrue(emptyMap.isEmpty());
    }
    
    @Test
    void testHashMapSizeGreaterThan() {
    	Map<String, String> myMap = new HashMap<>();
        myMap.put("key1", "value1");
        myMap.put("key2", "value2");
        myMap.put("key3", "value3");
        
        assertTrue(myMap.size()>2);
    }
    
}
