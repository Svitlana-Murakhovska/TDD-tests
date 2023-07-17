package com.epam.ld.module2.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


//The system replaces variable placeholders
// like #{subject} from a template with values provided at runtime.

public class TemplateGeneratorTest {

    @Test
    public void replaceVariablePlaceholders_TemplateWithSubject_Success() {
        // Arrange
        String template = "Hello, #{name}! Your subject is #{subject}.";
        String expected = "Hello, John! Your subject is Meeting.";
        TemplateGenerator templateGenerator = new TemplateGenerator();

        // Act
        String result = templateGenerator.replaceVariablePlaceholders(template, "John", "Meeting");

        // Assert
        assertEquals(expected, result);
    }
}