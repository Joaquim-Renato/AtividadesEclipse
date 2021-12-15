package SequencialExercicios;

import java.util.Scanner;
	public class Sequencial1 {
		public static void main(String args[]) {

	Scanner ler = new Scanner (System.in);
	int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;
	
	
	System.out.println("Calculadora de idade em dias...");
	
	System.out.println("Digite os anos:\n");
	IdadeAnos = ler.nextInt();
	
	System.out.println("\nDigite os meses:");
	IdadeMeses =ler.nextInt();
	
	System.out.println("\nDigite os dias:");
	IdadeDias = ler.nextInt();
	
	IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
	System.out.println("Idade total em dias ="+ IdadeTotalDias+ "\n");
	
		}
		
	}
