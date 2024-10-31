package atividade.java.vetores;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sequenciaNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite o número que você deseja encontrar:");
		int numero = scanner.nextInt();

		
		for (int i = 0; i < sequenciaNumeros.length; i++) {
			if (sequenciaNumeros[i] == numero) {
				int posicao = i;
				System.out.println("O numero " + numero +  " está localizado na posição : " + posicao);
			}
			
		}

		scanner.close();
	}

}
