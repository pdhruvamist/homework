package basics.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversePrint {


	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arrayString = null;
		try {
			arrayString = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] stringArray= arrayString.split("");

		for(int i=stringArray.length-1; i>=0; i--) {
			System.out.print(stringArray[i]);
		}

	}

}
