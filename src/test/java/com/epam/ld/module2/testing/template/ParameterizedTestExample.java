package com.epam.ld.module2.testing.template;
import org.junit.jupiter.api.TestTemplate;
        import org.junit.jupiter.api.extension.ExtendWith;
        import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
        import java.util.stream.Stream;
        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(ParameterResolverExtension.class)
public class ParameterizedTestExample {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void sumTest(int a, int b, int expectedSum) {
        // Given
        Calculator calculator = new Calculator();

        // When
        int sum = calculator.sum(a, b);

        // Then
        assertEquals(expectedSum, sum);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(-5, 10, 5),
                Arguments.of(0, 0, 0)
        );
    }

    @TestTemplate
    void additionalTestTemplate() {
        // Given
        String input = "Test";

        // When
        String result = doSomething(input);

        // Then
        assertTrue(result.startsWith("Test"));
    }

    private String doSomething(String input) {
        // Perform some operation
        return input + " Result";
    }
}
