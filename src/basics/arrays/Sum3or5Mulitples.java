package basics.arrays;

import java.util.stream.IntStream;

public class Sum3or5Mulitples {

    //SKY tv cogni internal round
    public static void main(String[] strings){
        int sum = IntStream.rangeClosed(1,1000).filter(digit -> digit%3 == 0 || digit%5==0).sum();
        System.out.println(sum);
    }
}
