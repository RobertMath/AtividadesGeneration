package atividade;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.US);
		
		float salario = 0.0f;
		float abono = 0.0f;
		float nSalario = 0.0f;
		
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		nSalario = salario + abono;
		
		System.out.println("O valor do novo salário é de: R$" + nSalario + ".");

	}

}
