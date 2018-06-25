package Mathematics;

import java.io.IOException;
import java.util.Scanner;

public class Mathematics1555 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
		
			long testCase = sc.nextLong();
	
			for (long i = 0 ; i < testCase ; i++ ) {
				
				long x = sc.nextLong();
				long y = sc.nextLong();
				
				
				String maior = ""; 
				long maiorNum = 0l;
				
				long r = ((3*x) * (3*x)) + ((y) * (y));
				
				if(r > maiorNum) {
					maior = "Rafael ";
					maiorNum = r;
				}
				
				long b = (2*(x*x)) + ((5*y)*(5*y));
				
				if (b > maiorNum) {
					maior = "Beto ";
					maiorNum = b ; 
				}
				
				long c = (-100 * x) + (y*y*y);
				
				if (c > maiorNum) {
					maior = "Carlos ";
					maiorNum = c;
				}
				
				System.out.printf("\n" + maior + "ganhou");
				
			}
		} while (sc.hasNext());
	}

}
