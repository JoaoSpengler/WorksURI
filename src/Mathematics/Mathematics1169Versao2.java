package Mathematics;

import java.io.IOException;
import java.util.Scanner;

public class Mathematics1169Versao2 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		//um unico for para realizar todo o trabalho!
		
		long testCase = sc.nextLong();
		
		for (int i = 0 ; i < testCase ; i++ ) {
			
			//colocar logica para pedir numero de quadrados;
			
			long quantidadeQuadrados = sc.nextLong();
			long graos = (long)Math.pow( 2d , quantidadeQuadrados-1);
			long kilos = (graos / 12) / 1000;
			
			System.out.println("Grao kilo: " + kilos);
			
		}

	}
	
}
