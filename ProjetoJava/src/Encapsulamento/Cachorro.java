package Encapsulamento;

public class Cachorro extends Animal{
	
	public static void main(String[] args) {
	Cachorro cachorro = new Cachorro();
	Animal ler = new Animal();
	ler.setNome(null);
	ler.getIdade();
	ler.getSom();
	
}
		private String correr = new String();

		public String getCorrer() {
			return correr;
		}

		public void setCorrer(String correr) {
			this.correr = correr;
		}
		
		public Cachorro() {
			this.correr = "correr";
		}
		
		public void locomocao() {
			
			System.out.println("locomocao: " + getCorrer());
			
		}
		

	}