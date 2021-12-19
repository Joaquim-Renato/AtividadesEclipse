package OutletGeneration;

public class TestandoProdutos extends ProdutosOutlet {
	
public TestandoProdutos(String cor, String tamanho, int qnt, double preco) {
		super(cor, tamanho, qnt, preco);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	

	ProdutosOutlet camiseta = new ProdutosOutlet ("Azul","G",2, 25.99);
	System.out.println(camiseta.getCor());
	System.out.println(camiseta.getTamanho());
	System.out.println(camiseta.getQnt());
	System.out.println(camiseta.getPreco());
	
	
	}
}



