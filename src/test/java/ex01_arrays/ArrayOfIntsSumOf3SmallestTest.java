package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfIntsSumOf3SmallestTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    public void test1() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{2, 5, 5, 5});
        assertEquals(12, result);
    }

    @Test
    public void test2() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{1, 2, 3, 4});
        assertEquals(6, result);
    }

    @Test
    public void test3() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{10, 20, 30, 40});
        assertEquals(60, result);
    }

}
