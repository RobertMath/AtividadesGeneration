package lacos.repeticao.DoWhile;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero = 0,soma = 0;

		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			if(numero > 0) {
				soma += numero;
			}
			
		} while (numero != 0);
		
		System.out.println("A soma dos números positivos é: "+soma);
		
		scanner.close();
	}
}
