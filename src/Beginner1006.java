import java.io.IOException;
import java.util.Scanner;

public class Beginner1006 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		double A = Double.parseDouble(sc.nextLine());
		double B = Double.parseDouble(sc.nextLine());
		double C = Double.parseDouble(sc.nextLine());
		
		double primeiraNota = A * (2.0 / 10);
		double segundaNota = B * (3.0 / 10);
		double terceiraNota = C *(5.0 / 10);
		
		//System.out.println(A + " = " + B + " = " + C);
		//System.out.println(primeiraNota + " = " + segundaNota + " = " + terceiraNota);
		
		double MEDIA = primeiraNota + segundaNota + terceiraNota;
		
		System.out.printf("MEDIA = %.1f" , MEDIA);
		System.out.println();
		
	}
	
}
