package atividade_switch;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		//ler 1 string, 1 int e 1 float
		// mostrar nome, cargo e novo salario
		Scanner sc = new Scanner(System.in);
		
		String nome,cargo = null;
		int x = 0;
		float salario,nSalario,reajuste = 0;
		
		System.out.println("Nome do Colaborador : ");
		nome = sc.nextLine();
		System.out.println("Código do Cargo:");
		x = sc.nextInt();
		
		switch(x) {
		case 1:
			cargo = "Gerente";
			reajuste = 10;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 7;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 9;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 6;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 5;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste =  8;
			break;
		}
		
		System.out.println("Salario:");
		salario = sc.nextFloat();
		
		nSalario = salario + (salario * reajuste / 100);
		System.out.printf("Nome do Colaborador : %s %n", nome);
		System.out.printf("Cargo : %s %n", cargo);
		System.out.printf("Salário: R$ %.2f %n", nSalario);
		
		sc.close();
		
	}
}
