package Encapsulamento;

public class TesteAnimais extends Animal {

		
		public static void main(String[] args) {
			
			Cachorro cachorro = new Cachorro();
			Cavalo cavalo = new Cavalo();
			Preguiça preguica = new Preguiça();
			
			
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

