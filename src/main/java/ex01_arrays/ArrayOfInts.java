package ex01_arrays;

import java.util.Arrays;

public class ArrayOfInts {
    public int sumOfInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int sum = 0;
        for (int i : arrayOfInts)
            sum += i;
        return sum;
    }

    public int sumOf3SmallestInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOf(copy, 3));
    }

    public int sumOfEven(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] even = new int[arrayOfInts.length];
        int evenLength = 0;
        for (int i : arrayOfInts)
            if (i % 2 == 0) even[evenLength++] = i;
        return sumOfInts(even);
    }

    //    The loop starts from the index Math.max(0, array.length - x), which ensures that we don't go out of bounds if x is larger than the array length. The Math.max() function returns the maximum of 0 and array.length - x, which effectively means we start from the x-th largest integer.

    public int sumOfXLargest(int[] arrayOfInts, int x) {
        if (arrayOfInts == null) return 0;
        int[] array = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(array);
//    The loop iterates over the last x elements of the sorted array (which are the largest integers) and adds each element to the sum variable.
        int sum = 0;
        for (int i = Math.max(0, array.length - x);
             i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    public int countMostPopularNumber(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        if (arrayOfInts.length == 0) return 0;

        // Create a copy of the input array to avoid modifying the original array
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        // Sort the copy of the array in ascending order
        Arrays.sort(copy);

        // Initialize variables to track the most frequent number
        int count = 1;
        int maxCount = 1;

        // Iterate through the sorted array, starting from the second element (index 1)
        for (int i = 1; i < copy.length; i++) {
            // Check if the current number is the same as the previous one
            if (copy[i] == copy[i - 1]) {
                // If same, increment the count
                count++;
            } else {
                // If different, reset the count to 1
                count = 1;
            }
            // Update the maximum frequency if necessary
            if (count > maxCount) {
                // Update maxCount if current count is greater
                maxCount = count;
            }
        }
        // Return the maximum frequency found in the array
        return maxCount;
    }

    public static void main(String[] args) {
        ArrayOfInts ex1 = new ArrayOfInts();
        int result = ex1.sumOfInts(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}
