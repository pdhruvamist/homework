package basics.string;

import java.util.Scanner;

public class LongestSubarrayBinaryFlip1_0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int left=0, output = 0, countZeros=0;

        for(int right=0 ;right < input.length(); right++) {
            if(input.charAt(right) == '0')
            {
                countZeros++;
            }

            while(countZeros > 1) {
                if(input.charAt(left) == '0')
                {
                    countZeros--;
                }
                left++;
            }

            output = Math.max(output, right - left + 1);
        }
        System.out.println("longest substring with only 1 zero has size="+ output);
    }
    
}
