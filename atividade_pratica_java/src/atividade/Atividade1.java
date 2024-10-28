package atividade;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
			int salario, nSalario, abono;
					
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextInt();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextInt();
		
		nSalario = salario + abono;
		
		System.out.println("O valor do novo salário é de: R$" + nSalario + ".");

	}

}
