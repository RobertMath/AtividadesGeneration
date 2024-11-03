package atividade.java.collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> listaNumeros = new HashSet<Integer>();

		listaNumeros.add(2);
		listaNumeros.add(5);
		listaNumeros.add(1);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(9);
		listaNumeros.add(7);
		listaNumeros.add(8);
		listaNumeros.add(10);
		listaNumeros.add(6);

		System.out.println("Digite o número que você deseja encontrar:");
		Integer numeroDigitado = scanner.nextInt();

		if (listaNumeros.contains(numeroDigitado)) {
			System.out.printf("O número %d foi encontrado!", numeroDigitado);
		}else {
			System.out.printf("O número %d não foi encontrado!", numeroDigitado);
		}
			
		scanner.close();
	}
}
