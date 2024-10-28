package atividade;

import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.US);

		float salario = 0.0f, adicionalNoturno = 0.0f, horaExtra = 0.0f, desconto = 0.0f, salarioLiquido = 0.0f;
		
		System.out.println("Digite o Salário Bruto:");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno:");
		adicionalNoturno = leia.nextFloat();

		System.out.println("Digite as Horas Extras");
		horaExtra = leia.nextFloat();
		
		System.out.println("Digite os Descontos:");
		desconto = leia.nextFloat();
		
		salarioLiquido = salario + adicionalNoturno + (horaExtra * 5) - desconto;
		
		System.out.println("Salário Líquido : R$ "+ salarioLiquido);
	}

}
