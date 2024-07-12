package basics.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map;
import java.util.Arrays;
import java.lang.Integer;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
import static java.util.function.Function.identity;

class MajorityElement {
    public static int majorityElement(int[] nums) {

       // Map<Integer, Integer> numCounts = Arrays.stream(nums).boxed().collect(toMap(identity(), new Integer("1"), IntStream::sum));
        Map<Integer, Integer> numCounts = new HashMap<>();
        for (int num : nums) {
            if (numCounts.containsKey(num)) {
                Integer val = numCounts.get(num);
                val++;
                numCounts.put(num, val);
            } else {
                numCounts.put(num, 1);
            }
        }
//Integer eins = 1;
//        Map<Integer, Integer> numCounts = Arrays.stream(nums).collect(
//                toMap(identity(), new Integer(1), doSomthing)
//        );

        return numCounts.entrySet().stream().filter(entry -> entry.getValue() > (nums.length/2)).mapToInt(Map.Entry::getKey).max().getAsInt();
    }

//    private BinaryOperator<Integer> doSomthing = () -> {return IntStream::sum};

    public static void main(String[] strings){
        int[] array = {3, 2, 3};
        int ret = majorityElement(array);
    System.out.println(ret);
    }
}