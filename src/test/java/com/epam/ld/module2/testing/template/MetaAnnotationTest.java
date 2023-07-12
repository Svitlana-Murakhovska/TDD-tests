package com.epam.ld.module2.testing.template;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

@SmokeTest
public class MetaAnnotationTest {

    @Test
    void testOne() {
        // Test implementation
    }

    @Test
    @EnabledIfSystemProperty(named = "environment", matches = "dev")
    void testTwo() {
        // Test implementation
    }
}
