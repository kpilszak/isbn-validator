import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateISBNTest {

    @Test
    public void checkValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN(140449116);
        assertTrue(result);
    }

    @Test
    public void checkInvalidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN(1404491167);
        assertFalse(result);
    }

}
