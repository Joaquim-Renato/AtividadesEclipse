package Encapsulamento;

public class Pregui�a {
	public static void main (String args[])
	{
		Animal preguica = new Animal();
		preguica.setNome("Pegri�inha");
		preguica.setIdade(2);
		preguica.setSom("Som do amor");
		
			System.out.println(preguica.getNome());
			System.out.println(preguica.getIdade());
			System.out.println(preguica.getSom());
}
}

