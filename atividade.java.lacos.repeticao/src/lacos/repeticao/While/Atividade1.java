package lacos.repeticao.While;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade, totalMenores21 = 0, totalMaiores50 = 0;
		boolean autenticador = true;

		while (autenticador) {

			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();
			
			if(idade <0 ) {
				autenticador = false;				
			}else if(idade <= 20) {
				totalMenores21++;		
			}else {
				totalMaiores50++;
			}
		}
		System.out.printf("Total de pessoas menores de 21 anos : %d %n ", totalMenores21);
		System.out.printf("Total de pessoas maiores de 50 anos : %d %n ", totalMaiores50);
		scanner.close();
	}
}
