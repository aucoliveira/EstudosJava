package secundario;

import java.util.ArrayList;

public class Clientes {
    public String nomeCliente;
    public String telefone;
    public String endereco;

    
    public Clientes(){}
    
    public Clientes(String nomeCliente,String telefone, String endereco){
    	this.nomeCliente = nomeCliente;
    	this.telefone = telefone;
    	this.endereco= endereco;
    	
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone ){
        this.telefone = telefone;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    static void pedido(){
       // ArrayList<>
    }
}