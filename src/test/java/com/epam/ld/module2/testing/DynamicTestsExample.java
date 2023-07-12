package com.epam.ld.module2.testing;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DynamicTestsExample {

    @TestFactory
    List<DynamicTest> dynamicTests() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Test 1", () -> {
                    // Assert
                    assertTrue(true); // Placeholder assertion to make the test fail initially
                }),
                DynamicTest.dynamicTest("Test 2", () -> {
                    // Assert
                    assertTrue(true); // Placeholder assertion to make the test fail initially
                })
        );
    }
}
