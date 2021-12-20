package SequencialExercicios;

import java.util.Scanner;

public class Sequencial2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int ano, mes, dia,anoemdia,mesemdia,totalemdia;
		
		System.out.println("Digite o numero de anos :");
		ano = ler.nextInt();
		System.out.println("Digite o numero de meses :");
		mes = ler.nextInt();
		
		System.out.println("Digite o numero de dias :");
		dia = ler.nextInt();
		
		anoemdia = 365 * ano;
		
		mesemdia = 30* mes;
		
		totalemdia = anoemdia + mesemdia + dia;
		
		
		System.out.println("Total em dia :" + totalemdia);
		
		
	

	}

}
