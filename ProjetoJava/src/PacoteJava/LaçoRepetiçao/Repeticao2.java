package PacoteJava.LaçoRepetiçao;
	import java.util.Scanner;
	
		
public class Repeticao2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				
		int num, NumPar=0, NumImpar=0;
		
		for(int x=1; x<=10; x++) {
			System.out.println("Digite o" +x+ "numero");
			num = ler.nextInt();
			
			if (num %2 == 0) {
				NumPar ++;
			}
			
				else if (num %2 ==1) {
					NumImpar++;
					
			}
		}
		System.out.println("Foram digitados"+NumPar+ "numeros pares\n");
		
		System.out.println("Foram digitados"+NumImpar+ "numeros impares\n");
	}
}
