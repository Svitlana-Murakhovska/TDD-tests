package com.epam.ld.module2.testing;

import com.epam.ld.module2.testing.MyCustomAnnotation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

    @MyCustomAnnotation(isCustomAnnotationPresent = false)
    public class MetaAnnotationTest {

        @Test
        void testOne() {
            // Assert
            assertTrue(true); // Placeholder assertion to make the test fail initially
        }

        @Test
        void testTwo() {
            // Assert
            assertTrue(true); // Placeholder assertion to make the test fail initially
        }
    }
