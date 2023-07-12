package com.epam.ld.module2.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidateISBNTests {

    @Test
    public void checkInvalidISBN(){
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("0140441927");
        assertFalse(result);
    }
}
