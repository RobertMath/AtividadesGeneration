package lacos.repeticao.For;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo:");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Digite o último número do intervalo:");
		int ultimoNumero = scanner.nextInt();
		
		if(primeiroNumero >= ultimoNumero ) {
			System.out.println("Intervalo inválido!");
			
		}

		for (int i = primeiroNumero; i <= ultimoNumero; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.printf("%d é multiplo de 3 e 5 %n", i);
			}

		}

	}
}
