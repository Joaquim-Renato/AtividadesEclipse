package PacoteJava.LaçoCondicional;

import java.util.*;

public class Condicional1 {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;

		System.out.printf("Entre com um numero inteiro:");
		n1 = ler.nextInt();

		System.out.printf("Entre com um numero inteiro:");
		n2 = ler.nextInt();

		System.out.printf("Entre com um numero inteiro:");
		n3 = ler.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.printf("\nSeu numero é o maior:" + n1);
		} else if (n2 > n2 && n2 > n3) {

			System.out.printf("\nSeu numero é o maior:" + n2);
		} else {
			System.out.printf("\nSeu numero é o maior:" + n3);
		}
	}
}
