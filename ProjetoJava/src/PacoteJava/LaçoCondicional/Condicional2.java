package PacoteJava.LaçoCondicional;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int a, b, c;

		System.out.printf("Entre com um numero:");
		a= ler.nextInt();

		System.out.printf("Entre com mais um numero:");
		b = ler.nextInt();

		System.out.printf("Entre com mais outro numero:");
		c = ler.nextInt();

		if (a < b && a < c) {
			System.out.printf( a+ "\n" +b+ "\n" +c);
			
		} else if (b < a && b < c) {

			System.out.printf(b+ "\n" +a+ "\n" +c );
		} else {
			System.out.printf(c+ "\n" +b+ "\n"+a );
}
	}
}