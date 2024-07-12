package basics.jp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class UnsortedTwoSum {
    public static void main(String[] args) {
        Arrays.stream(findTwoSums(new int[]{2, 6, 3, 8}, 9)).forEach(System.out::println);
    }

    private static int[] findTwoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            }
        }

        return new int[] {-1};
    }
}
