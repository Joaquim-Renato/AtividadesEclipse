package Encapsulamento;

public class TesteAnimais extends Animal {

		
		public static void main(String[] args) {
			
			Cachorro cachorro = new Cachorro();
			Cavalo cavalo = new Cavalo();
			Pregui�a preguica = new Pregui�a();
			
			
//			Dados Padroes
			cachorro.mostrarDados();
			cachorro.locomocao();
			System.out.println();
			
			cavalo.mostrarDados();
			cachorro.locomocao();
			System.out.println();
			
			preguica.mostrarDados();
			preguica.locomocao();
			System.out.println();
		}
	}

