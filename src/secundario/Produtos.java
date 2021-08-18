package secundario;

//import com.sun.deploy.cache.BaseLocalApplicationProperties;

public class Produtos {

    public String nomeProduto;
    public float valorProduto;
    public int quantidade;

    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public float getValorProduto(){
        return valorProduto;
    }
    public void setValorProduto(float valorProduto){
        this.valorProduto = valorProduto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }


}
