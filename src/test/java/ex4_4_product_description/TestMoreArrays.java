package ex4_4_product_description;

import ex4_5_moreArrays.ArrayOfIntegers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMoreArrays {


    @Test
    public void testFindCommonElements() {
        ArrayOfIntegers commonElements = new ArrayOfIntegers();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] expected = {4, 5};
        int[] actual = commonElements.findCommonElements(arr1, arr2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindDuplicateValues() {
        ArrayOfIntegers finder = new ArrayOfIntegers();
        int[] arr = {1, 2, 3, 2, 4, 5, 5, 6};
        int[] expected = {2, 5};
        int[] actual = finder.findDuplicateValues(arr);
        assertArrayEquals(expected, actual);
    }
}


