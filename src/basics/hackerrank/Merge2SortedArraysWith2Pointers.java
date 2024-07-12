package basics.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Merge2SortedArraysWith2Pointers {
    public static void main(String[] args) {
        int[] first = {1, 4, 7, 20};
     //   int[] other = {1, 4, 7, 20};
        int[] other = {3, 5, 26};

        System.out.println(mergedArrays(first, other));
    }

    private static List<Integer> mergedArrays(int[] first, int[] other) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < first.length && j < other.length) {
            if (first[i] < other[j]) {
                result.add(first[i]);
                i++;
            } else {
                result.add(other[j]);
                j++;
            }
        }

        while (i < first.length) {
            result.add(first[i]);
            i++;
        }

        while (j < other.length) {
            result.add(other[j]);
            j++;
        }
        return result;
    }
}
