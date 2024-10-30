package lacos.repeticao.For;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: %n", i);
			int numero = scanner.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println("Total de números pares:" + par);
		System.out.println("Total de números impares :" + impar);
		scanner.close();
	}
}
