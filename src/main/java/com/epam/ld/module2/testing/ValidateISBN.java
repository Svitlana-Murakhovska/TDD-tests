package com.epam.ld.module2.testing;

public class ValidateISBN {

    public boolean checkISBN(String isbn) {

        if (isbn.length() == 10 || isbn.length() == 13) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += isbn.charAt(i) * (10 - i);
            }
            if (total % 11 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new NumberFormatException("ISBN number should have length of 10 or 13");
        }
    }
}
