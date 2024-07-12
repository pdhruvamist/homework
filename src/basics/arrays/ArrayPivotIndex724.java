package basics.arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Integer;

public class ArrayPivotIndex724 {
    public int pivotIndex(int[] nums) {

        int total = Arrays.stream(nums).sum();

        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {

            if (runningSum == total - runningSum - nums[i]) {
                return i;
            }
            runningSum += nums[i];
        }

        return -1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = {1, 7, 3, 6, 5, 6};

        int ret = new ArrayPivotIndex724().pivotIndex(nums);

        System.out.print(ret);
}
}
