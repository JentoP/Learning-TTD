package ex4_6_hellofresh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testHelloFresh {
    @Test
    void testUnits() {

        ex4_6.Ingredient i = new ex4_6.Ingredient("chocolate", "g", 1);
        assertEquals("g", i.getUnits());
    }

}
