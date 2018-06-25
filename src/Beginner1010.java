import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Beginner1010 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int code1 = sc.nextInt();
		int unidad1 = sc.nextInt();
		float priceUnit1 = sc.nextFloat();
		
		int code2 = sc.nextInt();
		int unidad2 = sc.nextInt();
		float priceUnit2 = sc.nextFloat();
		
		float valueTotal1 = unidad1 * priceUnit1;
		float valueTotal2 = unidad2 * priceUnit2;
		
		//System.out.println(valueTotal1);
		//System.out.println(valueTotal2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n" , valueTotal1 + valueTotal2);
		
	}
}
