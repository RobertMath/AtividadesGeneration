package atividade;


import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.US);
		float n1 = 0.0f,n2 = 0.0f,n3 = 0.0f,n4 = 0.0f,media = 0.0f;
		
		System.out.println("Digite a nota 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		n4 = leia.nextFloat();
		
		media = (n1+n2+n3+n4) / 4;
		
		System.out.println(media);
	}

}
