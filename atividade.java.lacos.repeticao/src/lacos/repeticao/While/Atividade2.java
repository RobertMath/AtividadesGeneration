package lacos.repeticao.While;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean autenticador = false;
		int pessoasParticipantes = 0, idades = 0, naoBinariosFullStack30 = 0, homensMobile40 = 0, mulheresFront = 0,
				totalBackend = 0;
		int genero, tipoDesenvolvedor, totalColaboradores = 0, somaIdade = 0;
		float mediaIdade;

		System.out.println("Digite a idade : ");
		int idade = scanner.nextInt();
		somaIdade =+ idade;
		totalColaboradores++;

		System.out.println("Identidade de gênero : (1-6) ");
		System.out.println("1 - Mulher Cis ");
		System.out.println("2 - Homem Cis ");
		System.out.println("3 - Não Binário");
		System.out.println("4 - Mulher Trans ");
		System.out.println("5 - Homem Trans ");
		System.out.println("6 - Outros ");
		genero = scanner.nextInt();

		System.out.println("Pessoa Desenvolvedora : (1-4)");
		System.out.println("1 - Backend");
		System.out.println("2 - Frontend");
		System.out.println("3 - Mobile");
		System.out.println("4 - FullStack");
		tipoDesenvolvedor = scanner.nextInt();

		if (tipoDesenvolvedor == 1) {
			totalBackend++;
		} else if (tipoDesenvolvedor == 2 && (genero == 1 || genero == 4)) {
			mulheresFront++;
		} else if (tipoDesenvolvedor == 3 && idade >= 40 && (genero == 2 || genero == 5)) {
			homensMobile40++;
		} else if (tipoDesenvolvedor == 4 && idade <= 30 && genero == 3) {
			naoBinariosFullStack30++;
		}

		mediaIdade = somaIdade / totalColaboradores;
		System.out.println("Deseja continuar a leitura de um novo colaborador ? (S/N)");
		boolean continuar = scanner.next().equalsIgnoreCase("s");
			
			while (continuar) {

				System.out.println("Digite a idade : ");
				idade = scanner.nextInt();
				totalColaboradores++;
				somaIdade = +idade;

				System.out.println("Identidade de gênero : (1-6) ");
				System.out.println("1 - Mulher Cis ");
				System.out.println("2 - Homem Cis ");
				System.out.println("3 - Não Binário");
				System.out.println("4 - Mulher Trans ");
				System.out.println("5 - Homem Trans ");
				System.out.println("6 - Outros ");
				genero = scanner.nextInt();

				System.out.println("Pessoa Desenvolvedora : (1-4");
				System.out.println("1 - Backend");
				System.out.println("2 - Frontend");
				System.out.println("3 - Mobile");
				System.out.println("4 - FullStack");
				tipoDesenvolvedor = scanner.nextInt();

				if (tipoDesenvolvedor == 1) {
					totalBackend++;
				} else if (tipoDesenvolvedor == 2 && (genero == 1 || genero == 4)) {
					mulheresFront++;
				} else if (tipoDesenvolvedor == 3 && idade >= 40 && (genero == 2 || genero == 5)) {
					homensMobile40++;
				} else if (tipoDesenvolvedor == 4 && idade <= 30 && genero == 3) {
					naoBinariosFullStack30++;
				}
				
				System.out.println("Deseja continuar a leitura de um novo colaborador ? (S/N)");
				continuar = scanner.next().equalsIgnoreCase("s");
				
			}
			

		
		System.out.printf("Número de pessoas desenvolvedoras Backend : %d %n", totalBackend);
		System.out.printf("Número de Mulheres Cis e Trans desenvolvedoras Frontend : %d %n" , mulheresFront);
		System.out.printf("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos : %d %n" , homensMobile40);
		System.out.printf("Número de Não Binários desenvolvedores FullStack menores de 30 anos : %d %n" , naoBinariosFullStack30);
		System.out.printf("Número de pessoas que responderam à pesquisa : %d %n" , totalColaboradores);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa : %.2f %n" , mediaIdade);
		
	}

}
