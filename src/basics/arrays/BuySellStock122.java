package basics.arrays;

import java.util.Arrays;

/**
 *
 * Unable to cater below eg related logic building :(
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 *              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 *
 */


public class BuySellStock122 {

    public static void main(String[] strings){
        int[] prices = {1,3,5,1,7};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        if(null==prices || prices.length == 1 ){
            return 0;
        }
        else{
            int min = Arrays.stream(prices).min().getAsInt();

            if(prices[prices.length-1] == min){
                return 0;
            } else {
                int index = 0, maxMargin = 0;

                while(index < prices.length){
                    if(min != prices[index]){
                        index++;
                        continue;
                    }
                    int max = 0, daySoldOn = 0;

                    for(int j=index+1; j < prices.length; j++){

                        if(prices[index] < prices[j]){
                            int margin = prices[j] - prices[index];

                            if(max < margin){
                                max = margin;
                                daySoldOn = j;
                            }
                        }
                    }
                    index = daySoldOn+1;
                    maxMargin += max;

                }
                return maxMargin;
            }

        }
    }
}