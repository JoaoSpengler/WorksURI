package Mathematics;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Mathematics1169 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int testCase = sc.nextInt();
		
		long vetorQuantidadeTestes[] = new long[testCase];
		long vetorQuantidadeGraos[] = new long[testCase];
		
		for (int y = 0; y < testCase ; y++) {
			int quantidadeQuadrados = sc.nextInt();
			vetorQuantidadeTestes[y] = quantidadeQuadrados;
		}
		
		for (int i = 0 ; i < testCase ; i++) {
			long quantidadeAtual = 1;
			for (int x = 0 ; x < vetorQuantidadeTestes[i] ; x++ ) {
				quantidadeAtual *= 2;
				
			}
			vetorQuantidadeGraos[i] = quantidadeAtual;
		}
		
		for (int b = 0 ; b < testCase ; b++) {
			long valorGramas = vetorQuantidadeGraos[b] / 12l;
			long valorKg = (long)(valorGramas / 1000.0);
			System.out.println( valorKg + " kg" );
		}

	}
}
