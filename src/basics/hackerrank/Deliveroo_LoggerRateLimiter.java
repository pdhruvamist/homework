package basics.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Deliveroo_LoggerRateLimiter {

    private static Map<String, Integer> messageTimestampMap = new HashMap<>();

    public static void main(String[] args) {
        int[] timestamp = {1, 4, 5, 10, 11, 14};
        String[] message = {"hello", "bye", "bye", "hello", "bye", "hello"};

        System.out.println(shouldPrintMessage(1, "foo")); // returns true
        System.out.println(shouldPrintMessage(4, "bar")); // returns true
        System.out.println(shouldPrintMessage(5, "bar")); // returns false
        System.out.println(shouldPrintMessage(10, "foo")); // returns false
        System.out.println(shouldPrintMessage(11, "bar")); // returns true
        System.out.println(shouldPrintMessage(14, "foo")); // returns false
    }

        private static boolean shouldPrintMessage(int timestamp, String message) {
            if (!messageTimestampMap.containsKey(message) || timestamp - messageTimestampMap.get(message) >= 5) {
                messageTimestampMap.put(message, timestamp);
                return true;
            }
            return false;
        }
}
