package ex01_arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysOfIntsSumOfEvenTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    public void testSumOfEven() {
        int result = arrayOfInts.sumOfEven(new int[]{1, 2, 3, 4});
        assertEquals(6, result);
    }

    public void testSumOfUneven() {
        int result = arrayOfInts.sumOfEven(new int[]{1, 3, 5, 7});
        assertEquals(0, result);
    }

    public void testEmptyArray() {
        int result = arrayOfInts.sumOfEven(new int[]{});
        assertEquals(0, result);
    }

    public void testNullArray() {
        int result = arrayOfInts.sumOfEven(null);
        assertEquals(0, result);
    }

    public void testParanoia() {
        int result = arrayOfInts.sumOfEven(new int[]{2, 7});
        assertEquals(2, result);
    }

}
