import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateISBNTest {

    @Test
    public void checkValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        assertTrue(result, "first value");
        result = validator.checkISBN("0140177396");
        assertTrue(result, "second value");
    }

    @Test
    public void checkValid13DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9781853260087");
        assertTrue(result, "first value");
        result = validator.checkISBN("9781853267338");
        assertTrue(result, "second value");
    }

    @Test
    public void tenDigitISBNsEndingInAnXAreValid() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test
    public void checkInvalid10DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449117");
        assertFalse(result);
    }

    @Test
    public void checkInvalid13DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9781853267336");
        assertFalse(result);
    }

    @Test
    public void nineDigitISBNsAreNotAllowed() {
        ValidateISBN validator = new ValidateISBN();

        assertThrows(NumberFormatException.class,
                () -> {
                    validator.checkISBN("123456789");
                });

    }

    @Test
    public void nonNumericISBNsAreNotAllowed() {
        ValidateISBN validator = new ValidateISBN();

        assertThrows(NumberFormatException.class,
                () -> {
                    validator.checkISBN("helloworld");
                });
    }

}
