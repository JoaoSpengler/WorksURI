import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Beginner1009 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		String name = sc.nextLine();
		double salary = sc.nextFloat();
		double bonus = sc.nextFloat();
		
		double bonusFinal = (bonus * 15) / 100;

		double total = salary + bonusFinal;
		
		System.out.printf("TOTAL = R$ %.2f" , total);
		System.out.println();
		
	}
	
}
