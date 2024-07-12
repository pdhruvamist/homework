package basics.arrays;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class SingleOccurringNum {

    public int singleNumber(int[] nums) {

      //Via MAP collection
        Map<Integer, Integer> numByCounts = Arrays.stream(nums).boxed().collect(toMap(k -> k, v -> 1, Integer::sum));

        for (int i = 0; i < nums.length; i++) {
            if (numByCounts.get(nums[i]) == 1) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SingleOccurringNum s = new SingleOccurringNum();
        int result = s.singleNumber(new int[]{2,2,1});
        System.out.println(result);
    }
}