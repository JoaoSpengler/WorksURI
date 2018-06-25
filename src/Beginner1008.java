import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Beginner1008 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int numero = sc.nextInt();
		int numeroHoras = sc.nextInt();
		float valor = sc.nextFloat();

		System.out.printf("NUMBER = %d\n" , numero);
		System.out.printf("SALARY = U$ %.2f\n" , numeroHoras * valor);
		
	}
}
