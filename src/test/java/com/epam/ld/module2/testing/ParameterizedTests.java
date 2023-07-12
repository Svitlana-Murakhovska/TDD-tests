package com.epam.ld.module2.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTests {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void isPositiveTest(int number) {
        // Assert
        assertTrue(number > 0); // Placeholder assertion to make the test fail initially
    }
}
