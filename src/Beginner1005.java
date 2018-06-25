import java.io.IOException;
import java.util.Scanner;

public class Beginner1005 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		double A = Double.parseDouble(sc.nextLine());
		double B = Double.parseDouble(sc.nextLine());
		
		double primeiraNota = A * (3.5 / 11);
		double segundaNota = B * (7.5 / 11);
		
		double MEDIA = primeiraNota + segundaNota;
		
		System.out.printf("MEDIA = %.5f" , MEDIA);
		System.out.println();
		
	}
	
}
