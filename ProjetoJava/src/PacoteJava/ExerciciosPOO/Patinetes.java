package PacoteJava.ExerciciosPOO;

public class Patinetes {
	
		private String cor;
		private String tamanho;
		private	String dono;
		 
		
		public Patinetes (String primeiro,String meio,String ultimo)
		{
		cor=primeiro;
		tamanho=meio;
		dono=ultimo;
		}
		
		public String getCaracteresPatinete()
		{
			String caracteresPatinete = cor+" "+tamanho+" "+dono;
			return caracteresPatinete;
		}
		
}

