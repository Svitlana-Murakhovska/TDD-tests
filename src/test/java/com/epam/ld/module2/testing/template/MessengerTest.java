package com.epam.ld.module2.testing.template;

import com.epam.ld.module2.testing.Messenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MessengerTest {

    @Test
    void replacePlaceholders_Success() {
        // Arrange
        String template = "Hello, #{name}!";
        String expected = "Hello, John!";

        // Act
        String result = Messenger.replacePlaceholders(template, "name", "John");

        // Assert
        assertEquals(expected, result);
    }

//    @Test
//    void replacePlaceholders_ThrowsException_WhenPlaceholderValueNotProvided() {
//        // Arrange
//        String template = "Hello, #{name}!";
//
//        // Act & Assert
//        assertThrows(PlaceholderValueNotProvidedException.class, () -> {
//            Messenger.replacePlaceholders(template);
//        });
//    }
}
