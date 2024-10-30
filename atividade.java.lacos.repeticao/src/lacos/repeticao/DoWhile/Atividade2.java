package lacos.repeticao.DoWhile;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0, soma = 0, cont = 0;

		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			if (numero != 0 && numero % 3 == 0) {
				soma += numero;
				cont++;
			}

		} while (numero != 0);
		
		
		if (cont > 0) {
			float media = (float) soma / cont;
			System.out.printf("A média dos números múltiplos de 3 é: %.2f ", media);
		} else {
			System.out.println("Nenhum múltiplo de 3 foi digitado.");
		}

		scanner.close();
	}
}
