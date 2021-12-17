package Encapsulamento;

public class Preguiça extends Animal {

		
		private String correr = new String();

		public String getCorrer() {
			return correr;
		}

		public void setCorrer(String correr) {
			this.correr = correr;
		}
		
		public Preguiça() {
			this.correr = "Subir Arvore";
		}
		
		public void locomocao() {
			
			System.out.println("locomocao: " + getCorrer());
			
		}
		

	}