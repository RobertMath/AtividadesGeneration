package atividades_if;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {

		// ler 3 inteiros e imprimir soma
		// informando se soma A+B =maior, menor ou igual C

		Scanner sc = new Scanner(System.in);
		int a, b, c, soma;

		System.out.println("Digite o número ");
		a = sc.nextInt();

		System.out.println("Digite o número ");
		b = sc.nextInt();

		System.out.println("Digite o número ");
		c = sc.nextInt();

		soma = a + b;

		if (soma == c) {
			System.out.println("A Soma de A + B é Igual a C");
		} else {
			if (soma > c) {
				System.out.println("A Soma de A + B é maior que  C");
			} else {
				System.out.println("A Soma de A + B é menor que C");
			}
		}
		sc.close();
	}
}
