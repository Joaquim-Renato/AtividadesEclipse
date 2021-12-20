package SequencialExercicios;

import java.util.Scanner;

public class Sequencial3 {
	
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			
			int totalseg, hora, segundos, minutos;
			
			System.out.print("Digite o número de segundos: ");
			totalseg = ler.nextInt();
			
			
			hora = totalseg/3600;
			minutos = (totalseg%3600)/60;
			segundos = totalseg%60;
			
			System.out.println("O evento durou "+ hora+" horas, "+minutos+" minutos e "+segundos+ " segundos");
			
				

			}

	}
