package basics.hackerrank;

import java.util.*;
import java.util.stream.IntStream;


public class Ubs_BlacklistedIpRegexRepeatRequestBlocker {

    private static void validateRequests(List<String> regexList, List<String> ipAddresses) {
        // Simulated request timestamp
        int[] requestTimes = IntStream.rangeClosed(1, ipAddresses.size()).toArray();
        //Map<request, Queue of timestamp for same>
        Map<String, Queue<Integer>> requestLog = new HashMap<>();

        //process requests
        for (int i = 0; i < ipAddresses.size(); i++) {
            String ip = ipAddresses.get(i);
            int currentTime = requestTimes[i];

            if (isBlacklisted(regexList, ip)) {
                System.out.println("IP " + ip + " is blacklisted.");
            } else if (!canProcessRequest(ip, currentTime, requestLog)) {
                System.out.println("IP " + ip + " is making requests too frequently.");
            } else {
                System.out.println("IP " + ip + " is allowed.");
            }
        }
    }

    public static boolean isBlacklisted(List<String> blacklistPatterns, String ip) {
        return blacklistPatterns.stream().anyMatch(ip::matches);
    }

    public static boolean canProcessRequest(String ip, int currentTime, Map<String, Queue<Integer>> requestLog) {
        requestLog.putIfAbsent(ip, new LinkedList<>());

        //FIFO sake
        Queue<Integer> timestamps = requestLog.get(ip);

        //discard FIFO when max duration allowed is over for the IPAdd by
        // 1. access - peek()
        // 2. poll - remove & dont throw exception if queue becomes empty by removal
        while (!timestamps.isEmpty() && currentTime - timestamps.peek() >= 5) {
            timestamps.poll();
        }

        // Queue.size()
        if (timestamps.size() >= 2) {
            return false;
        } else {
            timestamps.add(currentTime);
            return true;
        }
    }

    public static void main(String[] args) {
        List<String> regexList = Arrays.asList("\\*121.*", "123.*", "34.*"); // Blacklisted regex patterns
        List<String> ipAddresses = Arrays.asList("123.1.23.34", "121.1.23.34", "121.1.23.34", "34.1.23.34","121.1.23.34",
                "12.1.23.34","121.1.23.34");

        validateRequests(regexList, ipAddresses);

    }

}
