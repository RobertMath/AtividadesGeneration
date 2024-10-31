package atividade.java.vetores;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = new int[10];
		int soma = 0;
		float media = 0;

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("digita");
			vetorInteiros[i] = scanner.nextInt();
			soma = soma + vetorInteiros[i];
			media = soma / (vetorInteiros.length);

		}

		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] % 2 == 0) {
				System.out.println("Elementos pares :" + vetorInteiros[i]);
			}
		}

		System.out.println("");

		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] % 2 > 0) {
				System.out.println("Elementos impares :" + vetorInteiros[i]);
			}
		}

		System.out.println("");
		System.out.println(soma);
		System.out.println("");
		System.out.println(media);

	}
}
