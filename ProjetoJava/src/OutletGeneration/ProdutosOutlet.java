package OutletGeneration;

import java.util.Scanner;

public class ProdutosOutlet extends LojaOnline {
	
	private String cor;
	private String tamanho;
	private int qnt;
	private double preco;
	private String produto;
		
	public  ProdutosOutlet(String cor, String tamanho, int qnt, double preco) {
		
		Scanner ler = new Scanner(System.in);
		Cadastro c = new Cadastro();
		this.cor = ("Preto"+ "\nAzul"+"\nVermelho"+"\nRosa"+"\nBranco");
		this.tamanho = ("P"+"M"+"G"+"XG");
		this.qnt = 0 ;
		this.preco = 0;
	
  
    	String escolha;
    	int quantidade = 0;
    	String cor1; 
    	String tamanho1;
    	
 
    	c.cadastro1();
    	System.out.println("Digite Camisa, Mochila, Boné ou Garrafa térmica: ");
    	escolha = ler.nextLine();
    	this.setProduto(escolha);
    	
    	
       String Cores = ("Preto,"+ " Azul,"+" Vermelho,"+" Rosa,"+" Branco");
       String Tamanho = ("P,"+ "M,"+" G");
        
       
    
        System.out.println("Escolha uma cor: "+Cores);
        cor1 = ler.nextLine();
        this.setCor(cor1);
        System.out.println("Escolha um tamanho: "+Tamanho);
        tamanho1 = ler.nextLine();
        this.setTamanho(tamanho1);
        
        System.out.println("Digite a quantidade: ");
        quantidade = ler.nextInt();
        this.setQnt(quantidade);
        
        
        System.out.println("----------------------\nPedido\n----------------------");
        System.out.println("Produto selecionado: "+this.getProduto());
        System.out.println("Cor selecionada: " +this.getCor());
        System.out.println("Tamanho selecionado: "+this.getTamanho());
        System.out.println("Quantidade: "+ this.getQnt());
        
    }
		
//	public void mostrarDados() 


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



	public String getProduto() {
		return produto;
	}



	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	
	
}




