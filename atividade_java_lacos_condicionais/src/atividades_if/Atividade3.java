package atividades_if;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// coletar 3 dados, string,inteiro e boolean
		// apontar se apto ou nao apto
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean apto = true;
		
		System.out.println("Digite o nome do doar: ");
		nome = sc.nextLine();
		
		System.out.println("Digite a idade do doar: ");
		idade = sc.nextInt();
		
		System.out.println("Primeira doação de sangue?");
		apto = sc.nextBoolean();
		
		
		if(idade >= 18 && idade <=59) {
			System.out.printf(" %s é apto para doar sangue! ",nome);
		}else {
			if(idade >= 60 && apto == false) {
				System.out.printf(" %s é apto para doar sangue! ",nome);
			}
			else {
				System.out.printf(" %s não esta apto para doar sangue!", nome);
			}
		}
		
		sc.close();

	}

}
