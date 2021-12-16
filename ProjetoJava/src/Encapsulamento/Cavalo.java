package Encapsulamento;

public class Cavalo {
	public static void main (String args[])
	{
		Animal cavalo = new Animal();
		cavalo.setNome("Bala no alvo");
		cavalo.setIdade(15);
		cavalo.setSom("Relincho");
		
			System.out.println(cavalo.getNome());
			System.out.println(cavalo.getIdade());
			System.out.println(cavalo.getSom());
}
}
