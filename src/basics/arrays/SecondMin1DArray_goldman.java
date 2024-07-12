package basics.arrays;

public class SecondMin1DArray_goldman {

    public static void main(String[] args) {
       int[] arr = {-5, -4, 0, 2, 10, 3, -5};
//        int[] arr = {6,1,37,-4,12,46,5,64,21,2,-4,-3};
 //       int[] arr = {-4 , -4 , -4 , -4, -3 };

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] < secondMin && arr[i] > min) {
                secondMin = arr[i];
            }

        }

        System.out.println("min="+min+" 2nd min="+secondMin);
    }
}
