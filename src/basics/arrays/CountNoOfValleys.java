package basics.arrays;

public class CountNoOfValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "DDUUUUDDDUU";
		//String s = "UDDDUDUU";
System.out.println(countingValleys(s.length(), s));
	}

	 // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
       int numValleys=0;
       if(n==0) {
           return numValleys;
       }

       int ground = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'U'){
                if(ground == 0){
                    numValleys++;
                }
                ground++;
            } else if (s.charAt(i) == 'D'){
                ground--;
            }
        }

      return numValleys;

    }

}

/**
         /\
....    /  \..   = 1 valley
    \  /
     \/


 **/