package atividades_if;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// ler um inteiro
		// indicar par ou impar
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if(x % 2 == 0 && (x >= 0)) {
			System.out.printf("O número %d é par e positivo!", x);
		}
		else if(x % 2 == 0 && (x < 0)) {
			System.out.printf("O número %d é par e negativo!", x);
		}else if(x % 2 != 0 && (x > 0)) {
			System.out.printf("O numero %d é impar e positivo!", x);			
		}else {
			System.out.printf("O numeroo %d é impar e negativo!",x);
		}
		sc.close();
	}

}
