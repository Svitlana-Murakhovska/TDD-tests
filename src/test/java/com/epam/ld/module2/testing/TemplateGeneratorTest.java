package com.epam.ld.module2.testing;

import com.epam.ld.module2.testing.template.Template;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


//The system replaces variable placeholders
// like #{subject} from a template with values provided at runtime.

public class TemplateGeneratorTest {

    @Test
    public void replaceVariablePlaceholders_TemplateWithSubject_Success() {
        // Arrange
        String template = "Hello, #{name}! Your subject is #{subject}.";
        String expected = "Hello, John! Your subject is Meeting.";
        Template templateGenerator = new Template();

        // Act
        String result = templateGenerator.replaceVariablePlaceholders(template, "John", "Meeting");

        // Assert
        assertEquals(expected, result);
    }

    private Template templateGenerator = new Template();

    @Test
    public void replaceVariablePlaceholders_IgnoreMissingPlaceholders_Success() {
        // Arrange
        String template = "Hello, #{name}! Your subject is #{subject}.";
        Map<String, String> variableMap = new HashMap<>();
        variableMap.put("name", "John");
        variableMap.put("age", "25");
        String expected = "Hello, John! Your subject is #{subject}.";

        // Act
        String result = templateGenerator.replaceVariablePlaceholders(template, variableMap);

        // Assert
        assertEquals(expected, result);
    }
}

