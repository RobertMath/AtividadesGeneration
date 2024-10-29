package atividade_switch;

import java.util.Scanner;

public class Atividade3 {

		public static void main(String[] args) {
			// ler 2 floats e 1 int
			// calcular o flot baseado no int o switch, dar o resultado e apontar falha 
			
			Scanner sc = new Scanner(System.in);
			int codigo = 0;
			float n1 = 0,n2 = 0, result = 0;
			
			
			System.out.println("Digite o 1º número: ");
			n1 = sc.nextFloat();
			
			System.out.println("Digite o 2º número: ");
			n2 = sc.nextFloat();
			
			System.out.println("Digite 1 para somar, 2 para subtrair, 3 para multiplicar ou 4 para dividir");
			codigo = sc.nextInt();
			
			switch(codigo) {
			case 1:
				result = n1 + n2;
				System.out.printf("%.2f + %.2f  = %.2f",n1 ,n2 ,result);
				break;
			case 2:
				result = n1 - n2;
				System.out.printf("%.2f - %.2f  = %.2f",n1 ,n2 ,result);
				break;
			case 3:
				result = n1 * n2;
				System.out.printf("%.2f * %.2f  = %.2f",n1 ,n2 ,result);
				break;
			case 4:
				result = n1 / n2;
				System.out.printf("%.2f / %.2f  = %.2f",n1 ,n2 ,result);
				break;
			default:
				System.out.println("Operação Inválida!");
				break;
				
			}
			
			
			
			
			
			
			
		}
}
