package ex4_5_more_arrays;

import ex4_4_product_description.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testAllElementsNull() {
        Product p = new Product("", null, null);
        String result = p.productDescription();
        assertEquals("", result);
    }

    @Test
    void testSizePercentageNull() {
        Product p = new Product("", 25, 0.0);
        String result = p.productDescription();
        assertEquals(" • 25CL", result);
    }

    @Test
    public void testSizeNullPercentage5() {
        Product p = new Product("", null, 5.0);
        String result = p.productDescription();
        assertEquals(" • 5%", p.productDescription());
    }

    @Test
    public void testNamePercentage8() {
        Product p = new Product("Duvel", null, 8.0);
        String result = p.productDescription();
        assertEquals("Duvel • 8%", p.productDescription());
    }
}
