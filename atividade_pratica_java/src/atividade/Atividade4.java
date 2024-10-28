package atividade;

import java.util.Locale;
import java.util.Scanner;

public class Atividade4 {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);
			leia.useLocale(Locale.US);
			
			float n1 = 0.0f, n2 = 0.0f, n3 = 0.0f, n4 = 0.0f,diferenca = 0.0f;
			
			System.out.println("Digite o numero 1");
			n1 = leia.nextFloat();
			
			System.out.println("Digite o numero 2");
			n2 = leia.nextFloat();
			
			System.out.println("Digite o numero 3");
			n3 = leia.nextFloat();
			
			System.out.println("Digite o numero 4");
			n4 = leia.nextFloat();
					
			diferenca = (n1 * n2) - (n3 * n4);
			
			System.out.println("Diferença : " + diferenca);
			
		}
}
