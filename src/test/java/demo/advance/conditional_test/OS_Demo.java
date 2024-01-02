package demo.advance.conditional_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.condition.OS.MAC;
import static org.junit.jupiter.api.condition.OS.WINDOWS;

public class OS_Demo {

    @Test
    @EnabledOnOs(MAC)
    void onlyOnMacOs() {
        System.out.println("Test");
    }

    @Test
    @EnabledOnOs(WINDOWS)
    void onlyOnWindowsOs() {
        System.out.println("Test");
    }

    @Test
    @DisabledOnOs(WINDOWS)
    void notOnWindows() {
        System.out.println("Test1");
    }


}
