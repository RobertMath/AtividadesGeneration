package atividade;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
			float salario, nSalario, abono;
					
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		nSalario = salario + abono;
		
		System.out.println("O valor do novo salário é de: R$" + nSalario + ".");

	}

}
