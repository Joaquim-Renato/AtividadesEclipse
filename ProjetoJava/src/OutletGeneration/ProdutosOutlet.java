package OutletGeneration;

public class ProdutosOutlet {
	
	private String cor;
	private String tamanho;
	private int qnt;
	private double preco;
	
	
	public ProdutosOutlet() {
		this.cor = ("Preto"+ "Azul"+"Vermelho"+"Rosa"+"Branco");
		this.tamanho = ("P"+"M"+"G"+"XG");
		this.qnt = 0 ;
		this.preco = 0;
	}
	public void mostrarDados() {
		System.out.println("Escolha uma cor:"+getCor());
		System.out.println("Escolha um tamanho:"+getTamanho());
		System.out.println("Quantos produtos você gostaria de incluir em seu carrinho??"+getQnt());
	}

	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	public int getQnt() {
		return qnt;
	}


	public void setQnt(int qnt) {
		this.qnt = qnt;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}




