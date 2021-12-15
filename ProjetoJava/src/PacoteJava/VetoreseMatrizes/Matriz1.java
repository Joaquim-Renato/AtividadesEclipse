package PacoteJava.VetoreseMatrizes;

import java.util.Scanner;

public class Matriz1 {
	
	public static void main(String[] args)
	{
		Scanner.ler=new Scanner(System.in);
	

	int matrizN1 [][] = new int [4] [6] ;
	int matrizN2 [][] = new int [4][6];
	
	
	
		for (int i=0; i<4; i++) {
		for (int j=0; j<6; j++) {
			System.out.println("Digite o valor da linha:"+i+"numero");
			System.out.println("Digite o valor da coluna:"+j+"numero");
			Object[][] matrizsoma;
			matrizsoma[i][j]= matrizN1+matrizN2;
			
			
		}
		}
		for (int i=0; i<4; i++) {
			for (int j=0; j<6; j++) {
				Object[][] matrizmultiplica;
				matrizmultiplica[i][j]= matrizN1*matrizN2;
			
			
			
		}
		
	}
		for (int i=0; i<4; i++) {
			System.out.println("\n");
			for (int j=0; j<6; j++) {
				System.out.print(matrizsoma[i][j]+"\t");
	}

}
		for (int i=0; i<4; i++) {
			System.out.println("\n");
			for (int j=0; j<6; j++) {
				System.out.print(matrizmultiplica[i][j]+"\t");	
	}
}
	}
}



