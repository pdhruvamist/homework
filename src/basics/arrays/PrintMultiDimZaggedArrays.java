package basics.arrays;

import java.util.Arrays;

public class PrintMultiDimZaggedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[2][3][1]
		int[][][] multiDimArr = new int[2][][];
		System.out.print(Arrays.deepToString(multiDimArr));
		for (int[][] array1 : multiDimArr) {
			array1 = new int[3][];	
			for (int[] array2 : array1) {
				array2 = new int[4];
				
				Arrays.fill(array2, 4);
			}
			
		}
		
	System.out.print(Arrays.deepToString(multiDimArr));



	}	
		
}
