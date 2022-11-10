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
    public void checkInvalidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449117");
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

}
