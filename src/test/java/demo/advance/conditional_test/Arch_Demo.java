package demo.advance.conditional_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.condition.OS.MAC;

public class Arch_Demo {
    @Test
    @EnabledOnOs(architectures = "aarch64")
    void onAarch64() {
        System.out.println("Test");
    }

    @Test
    @DisabledOnOs(architectures = "x86_64")
    void notOnX86_64() {
        System.out.println("Test");
    }

    @Test
    @EnabledOnOs(value = MAC, architectures = "arm64")
    void onNewMacs() {
        System.out.println("Test");
    }
}
