package PacoteJava.ExerciciosPOO;

import java.util.Scanner;

public class Patinete {
	
	private String cor = new String();
	private String tamanho = new String();
	public String getCor() {
		return cor;
	
	}
	public void setCor(String cor) {
		this.cor = cor;
		Scanner ler = new Scanner(System.in);
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String dono) {
		this.tamanho = dono;
	}
	
	public Patinete() {
		this.cor = "none";
		this.tamanho = "Default";
	}
	
	public void showData() {
		System.out.println("dono: " + this.tamanho);
		System.out.println("cor: " + this.cor	);
	}
	
	
}
