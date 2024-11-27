package ex4_5_moreArrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfIntegers {

    public int[] findCommonElements(int[] arr1, int[] arr2) {
        List<Integer> commonElements = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !commonElements.contains(arr1[i])) {
                    commonElements.add(arr1[i]);
                }
            }
        }
//        nieuwe array met dezelfde ints
        int[] result = new int[commonElements.size()];
        for (int i = 0; i < commonElements.size(); i++) {
            result[i] = commonElements.get(i);
        }
        return result;
    }

    public int[] findDuplicateValues(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    duplicates.add(arr[i]);
                }
            }
        }
//        nieuwe array met de dubbele waarden
        int[] result = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            result[i] = duplicates.get(i);
        }
        return result;
    }

}
