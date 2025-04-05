package main.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ultiplierTest {

    @Test
    void testMultiplication() {
        Multiplier multiplier = new Multiplier();
        assertEquals(6, multiplier.multiply(2, 3), "2 * 3 should equal 6");
    }
}
