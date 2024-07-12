package basics.string;

import java.util.Scanner;

public class LongestSubarraySumUpto8 {

    public static void main(String[] args) {
        int[] input = {3, 1, 2, 7, 4, 2, 1, 1, 5};

        int left=0, output = 0, localMax=0;

        for(int right=0 ;right < input.length; right++) {
            localMax+= input[right];

            while(localMax > 8){
                localMax-=input[left];
                left++;
            }
            output = Math.max(output, right - left + 1);
        }
        System.out.println("longest substring with sum upto 8 size="+ output);
    }
    
}
