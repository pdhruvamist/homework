package basics.arrays;

public class NumsOfSubarrayProductLessThan100 {

    public static void main(String[] args) {
        int[] input = {10, 5, 2, 6};

        int left=0, output = 0, localMax=1;

        for(int right=0 ;right < input.length; right++) {
            localMax *= input[right];

            while(localMax >= 100){
                localMax/=input[left];
                left++;
            }
            output += (right - left + 1);
        }
        System.out.println("longest substring with product upto 100 size="+ output);
    }
    
}
