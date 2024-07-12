package basics.arrays;

public class MaxSumOfSubarrayOfLength4 {

    public static void main(String[] args) {
        int[] input = {3, -1, 4, 12, -8, 5, 6};
        int localMax = 0;
        for(int i=0; i < 4; i++) {
            localMax += input[i];
        }
        System.out.println("localMax="+ localMax);
        int left=0, output = localMax;

        for(int i=4;i < input.length; i++) {
            localMax+=input[i]-input[i-4];
            output = Math.max(output, localMax);
        }
        System.out.println("Max sum with window 4="+ output);
    }
    
}
