package PacoteJava.ExerciciosPOO;
// import java.util.Scanner;

public class Cliente {
	
	
	private String primeiroNome;
	private String codigoMatricula;
	private	String identGenero;
	 
	
	public Cliente (String primeiro,String meio,String ultimo)
	{
	 primeiroNome=primeiro;
	 codigoMatricula=meio;
	 identGenero=ultimo;
	}
	public String getCadastroPessoal()
	{
		String cadastroPessoal = primeiroNome+" "+codigoMatricula+" "+identGenero;
		return cadastroPessoal;
		
	 
	}
	
}


		
		
	