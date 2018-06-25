package Mathematics;

import java.io.IOException;
import java.util.Scanner;

public class Mathematics1198 {
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			long soldadosAliados = sc.nextLong();
			long soldadosInimigos = sc.nextLong();

			Long soldadosRestantes = 0l;

			if (soldadosAliados < soldadosInimigos) {
				soldadosRestantes = soldadosInimigos - soldadosAliados;
			} else {
				soldadosRestantes = soldadosAliados - soldadosInimigos;
			}
			
			System.out.println(soldadosRestantes);
			
		}		
		
	}
}
