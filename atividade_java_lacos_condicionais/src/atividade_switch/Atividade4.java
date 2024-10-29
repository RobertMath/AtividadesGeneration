package atividade_switch;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		//saldo comeca em 1000
		// 3 operacoes possiveis, saldo, saque e deposito
		//sacar apenas se valor for <=  ao saldo
		
		Scanner sc = new Scanner(System.in);
		int codigo;
		float saldo = 1000f,nSaldo =0 ,saque = 0,deposito = 0;
		String operacao= null;
		
		System.out.println("Operação: ");
		codigo = sc.nextInt();
				
		switch(codigo) {
		case 1:
			operacao = "Saldo";
			System.out.printf("Saldo: %.2f" , saldo);
			break;
		case 2:
			operacao = "Saque";
			System.out.println("Valor: ");
			saque = sc.nextFloat();
			
			if(saque > saldo) {
				System.out.println("Saldo Insuficiente!");
			}else {
				nSaldo = saldo - saque;
				System.out.printf("Novo Saldo: R$ %.2f ", nSaldo);
			}
			break;
		case 3:
			operacao = "deposito";
			System.out.println("Valor: ");
			deposito = sc.nextFloat();
			
			nSaldo = saldo + deposito;
			System.out.printf("Novo Saldo: R$ %.2f", nSaldo);
			break;	
		default:
			System.out.println("Operação Inválida!");
			break;
		}
		sc.close();
	}
}
