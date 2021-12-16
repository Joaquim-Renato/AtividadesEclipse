package Encapsulamento;

public class Cachorro {
	public static void main (String args[])
	{
		Animal cachorro = new Animal();
		cachorro.setNome("Bolinha");
		cachorro.setIdade(2);
		cachorro.setSom("Latido");
		
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getIdade());
			System.out.println(cachorro.getSom());
			
	}
}
