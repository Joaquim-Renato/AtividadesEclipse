package PacoteJava;

import java.util.Scanner;

public class Repeticao3 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade = 0, jovem = 0, velho = 0;
		System.out.printf("\nEntre com a sua idade:");
		idade = entrada.nextInt();

		while (idade != -99) {
			System.out.printf("\nSua idade: %d", idade);
			if (idade <= 21) {

				System.out.printf("Você tem menos de 21...\n");
				jovem++;
			}

			else if (idade >= 50)

			{
				System.out.printf("Você tem mais de 50 anos...\n");
				velho++;
			}

			System.out.printf("Entre com a sua idade:");
			idade = entrada.nextInt();
			System.out.printf("velhos: " + velho);

			System.out.println("jovem: " + jovem);
		}

	}
}
