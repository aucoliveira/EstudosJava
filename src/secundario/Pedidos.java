package secundario;
import java.util.ArrayList;

public class Pedidos extends Clientes{

	public float volaorTotalPedido;
    public ArrayList<Produtos> produtosEscolhidos = new ArrayList<Produtos>();
	/*public Pedidos (){}
	public Pedidos(String nomeCliente,String telefone, String endereco) {
    	super(nomeCliente,telefone,endereco);
	}
	*/
	

    public void addd(Produtos produtos) {
    	produtosEscolhidos.add(produtos);
    }
    
    
    
    public ArrayList<Produtos> getProdutosEscolhidos() {
		return produtosEscolhidos;
	}



	public void setProdutosEscolhidos(ArrayList<Produtos> produtosEscolhidos) {
		this.produtosEscolhidos = produtosEscolhidos;
	}



	public float calcularPreco(){

        float valorTotal=0;
        for(int i =0; i < produtosEscolhidos.size(); i++){
            valorTotal += produtosEscolhidos.get(i).valorProduto;
        }
        System.out.println(valorTotal);
        return valorTotal;
    }
}