package basics.metrix;

import java.util.Arrays;

public class SortRowByRow {

    public static void main(String[] args) {
        int[][] arr = {
                {77, 11, 22, 3},
                {11, 89, 1, 12},
//                {32, 11, 56, 7},
                {11, 22, 44, 33}
        };

        int[][] sorted = sortRowByRow(arr);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(Arrays.toString(sorted[i]));
            System.out.println();
        }
    }

    private static int[][] sortRowByRow(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                //bubble sort??
                if (arr[i][j - 1] > arr[i][j]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j - 1];
                    arr[i][j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
