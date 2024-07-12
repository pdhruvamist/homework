package basics.arrays;


import java.util.HashMap;
import java.util.Map;

class SingleNum136 {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numsByCount = new HashMap<>();

        for (int num : nums) {
            if (numsByCount.containsKey(num)) {
                int counts = numsByCount.get(num) + 1;
                numsByCount.put(num, counts);
            } else {
                numsByCount.put(num, 1);
            }
        }

        return numsByCount.entrySet().stream().filter(entry -> entry.getValue()==1).findFirst().map(Map.Entry::getKey)
                .orElse(-1);
    }

    public static void main(String[] strings){
        int[] array = {4,5,6,7,4,5,6};
        int result = singleNumber(array);

        System.out.println(result);
    }
}