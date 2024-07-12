package basics.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SpiralPrint2D {

	public static void main(String[] args) {
		int[][] matrix = new int[3][];
		matrix[0] = new int[2];
		matrix[1] = new int[2];
		matrix[2] = new int[2];


/**		Convert Map from 2D Array using stream
works ->  Arrays.stream(matrix).collect(toMap(..., ...));
**/

		int i=0;
		for(int x=0; x < matrix.length; x++) {
			for(int y=0; y<matrix[0].length; y++, i++) {
				matrix[x][y] = i;
			}
		}
		
		System.out.println(Arrays.toString(spiralOrder(matrix)));
		
	}
		static int[] spiralOrder(final int[][] A) {
	        
	        List<Integer> spiralOrderedArray = new ArrayList<>();
	        
	        if(A.length == 0)
	            return spiralOrderedArray.stream().mapToInt(element->element).toArray();
	        
	        int rowUp = 0;
	        int columnLeft = 0;
	        int rowDown = A.length-1;
	        int columnRight = A[0].length -1;
	        
	        while(rowUp <= rowDown && columnLeft <= columnRight){
	            
	            for(int y=columnLeft; y<= columnRight; y++){
	                spiralOrderedArray.add(A[rowUp][y]);
	            }
	            rowUp++;
	            
	            for(int x=rowUp; x <= rowDown; x++){
	                spiralOrderedArray.add(A[x][columnRight]);
	            }
	            columnRight--;
	            
	            if(rowUp <= rowDown){
	                for(int y=columnRight; y>= columnLeft; y--){
	                    spiralOrderedArray.add(A[rowDown][y]);
	                }
	                rowDown--;
	            }
	            
	            if(columnLeft <= columnRight){
	                for(int x=rowDown; x>=rowUp; x--){
	                    spiralOrderedArray.add(A[x][columnLeft]);
	                }
	                columnLeft++;
	            }
	        }
	        return spiralOrderedArray.stream().mapToInt(element->element).toArray();
	        }
}