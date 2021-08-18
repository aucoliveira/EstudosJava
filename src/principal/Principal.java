package principal;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import secundario.*;
public class Principal {
	 static ArrayList<Clientes> cadastroDeClientes = new ArrayList<Clientes>();
     static ArrayList<Produtos> cadastroDeProdutos = new ArrayList<Produtos>();
     static ArrayList<Pedidos> cadastroPedidos = new ArrayList<Pedidos>();
     static Pedidos pedido = new Pedidos();
     static Scanner scanner = new Scanner(System.in);
     
    public static void main(String[] args){
       
        menu();
        
    }
    static void imprimeNaMesmaLinha(String texto){
        System.out.print(texto);
    }
    static void imprimeSaltaLinha(String texto) {
        System.out.println(texto);
    }
    static void imprimeTraco() {
        System.out.println("-------------------------------------------");
    }
    static String recebeString(String texto,Scanner scanner) {
        imprimeNaMesmaLinha(texto);
        String recebe = scanner.nextLine();
        return recebe;
    }
    static String recebe(String texto, Scanner scanner) {
        String recebe = scanner.nextLine();
        return recebe;
    }
    static Float recebeFloat(String texto,Scanner scanner) {
        imprimeNaMesmaLinha(texto);
        Float recebe = scanner.nextFloat();
        return recebe;
    }
    static int recebeInt(String texto,Scanner scanner) {
        imprimeNaMesmaLinha(texto);
        int recebe = scanner.nextInt();
        return recebe;
    }


    static ArrayList listaProdutos() {

        for(int i =0; i < cadastroDeProdutos.size(); i++){
            System.out.println(i + "-" + ((Produtos) cadastroDeProdutos.get(i)).getNomeProduto() + "  valor  "
                    + ((Produtos) cadastroDeProdutos.get(i)).getValorProduto());
        }
        return cadastroDeProdutos;
    }
    static ArrayList listaClientes() {
        imprimeTraco();
        imprimeSaltaLinha("Listagem de clientes: ");
        imprimeTraco();
        for(int i =0; i < cadastroDeClientes.size(); i++){
            System.out.println(i + "-" + ((Clientes) cadastroDeClientes.get(i)).getNomeCliente());
        }
        imprimeTraco();
        return cadastroDeClientes;
    }

    static void listaItens() {
        imprimeTraco();
        imprimeSaltaLinha("Listagem de produtos: ");
        imprimeTraco();

        for(int i =0; i < cadastroDeProdutos.size(); i++){
            System.out.println(i + "-" + ((Produtos) cadastroDeProdutos.get(i)).getNomeProduto());
        }
        imprimeTraco();
    }
    
    static void listaPedidos() {
    	imprimeTraco();
    	imprimeSaltaLinha(".:Listagem de pedidos realizafos:.");
    	imprimeTraco();
    	for(int i = 0; i < cadastroPedidos.size();i++) {
    		imprimeTraco();
    		System.out.println("Pedido: "+ i+1);
    		System.out.println("Nome do cliente: "    +((Pedidos) cadastroPedidos.get(i)).getNomeCliente());
    		System.out.println("Telefone do Cliente: "+((Pedidos) cadastroPedidos.get(i)).getTelefone());
    		System.out.println("Endereço do cliente: "+((Pedidos) cadastroPedidos.get(i)).getEndereco());
    		imprimeTraco();
    		for(int y =0; y < pedido.produtosEscolhidos.size(); y++) {
    			System.out.print(pedido.produtosEscolhidos.get(y).getNomeProduto());
    			System.out.println(" "+pedido.produtosEscolhidos.get(y).getValorProduto());
    		}
    	pedido.calcularPreco();
    	imprimeTraco();
    	}
    }
    static void menu(){
        
        int opcao = 0;

        do{
             opcao =  recebeInt("Digite:\n 1 - Para cadastrar um novo Cliente;\n 2 - Para listar os Clientes já cadastrados;"
                     + "\n 3 - Para cadastrar um novo produto;\n 4 - Para listar os Produtos já cadastrados; \n 5 - cadastrar pedidos;" +
                     "\n 6 - Para listar os pedidos já feitos;\n 7 - Sair; ",scanner);
            switch(opcao) {
                case 1:
                    cadastroCliente();
                    break;
                case 2:
                    listaClientes();
                    break;
                case 3:
                    cadastroProdutos();
                    break;
                case 4:
                    listaItens();
                    break;
                case 5:
                    //Pedidos pedido = new Pedidos();
                    listaClientes();
                    int clienteEscolhido = scanner.nextInt();
                    System.out.println("O cliente escolhido foi: "+((Clientes) cadastroDeClientes.get(clienteEscolhido)).getNomeCliente());
                    //pedido.setNomeDoCliente(cadastroDeClientes.get(clienteEscolhido).getNomeCliente());
                    //pedido.setEndereçoDoCliente(cadastroDeClientes.get(clienteEscolhido).getEndereco());
                    //pedido.setTelefone(cadastroDeClientes.get(clienteEscolhido).getTelefone());
                    int opc = 0;
                   // ArrayList<Produtos> produtos =new ArrayList<Produtos>();

                    do {
                        listaProdutos();
                        //recebendo o indice do array cadastoDeProdutoos
                        int produtoEscolhido = recebeInt("Qual produto deseja adicionar na cesta ", scanner);

                        pedido.addd(cadastroDeProdutos.get(produtoEscolhido));
                                      
                       // System.out.println(pedido.getProdutosEscolhidos(produtoEscolhido));
						
                     pedido.calcularPreco();
                    cadastroPedidos.add(pedido);
                        
                        //saindo do programa cadastro de pedidos
                        opc =recebeInt("Digite 1 - para continuar ou 2 - para finalizar a conta: ", scanner);
                        imprimeTraco();
                        //imprimindo na tela os pedidos escolhidos
                        System.out.println("O cliente escolhido foi: "+((Clientes) cadastroDeClientes.get(clienteEscolhido)).getNomeCliente());
                        System.out.println("Endereço: "+((Clientes) cadastroDeClientes.get(clienteEscolhido)).getEndereco());


                    }while(!(opc==2));

                case 6:
                	listaPedidos();
                	break;
                	
                case 7:
                    imprimeTraco();
                    imprimeSaltaLinha("Saindo do menu, obrigado.");
                    imprimeTraco();
                    break;
                default:
                    imprimeTraco();
                    imprimeSaltaLinha("Opção invalida.");
                    break;

            }

        }while(!(opcao ==6));


        scanner.close();
    }
    static void cadastroCliente(){
        imprimeTraco();
        imprimeSaltaLinha("Realize o cadastro do Cliente  logo abaixo: ");
        imprimeTraco();
        Clientes cliente = new Clientes();
        recebe("",scanner);
        cliente.setNomeCliente(recebeString("Digite o nome do cliente: ", scanner));
        cliente.setEndereco(recebeString("Digite o endereço: ", scanner));
        cliente.setTelefone(recebeString("Digite o telefone: ", scanner));
        cadastroDeClientes.add(cliente);
        imprimeTraco();
    }
    static void cadastroProdutos(){
        imprimeTraco();
        imprimeSaltaLinha("Realize o cadastro do produto  logo abaixo: ");
        imprimeTraco();
        Produtos produto = new Produtos();
        recebe("",scanner);
        produto.setNomeProduto(recebeString("Digite o nome do produto: ", scanner));
        produto.setValorProduto(recebeFloat("Digite o preço: ", scanner));
        produto.setQuantidade(recebeInt("Digite a quantidade: ", scanner));
        cadastroDeProdutos.add(produto);
        imprimeTraco();
    }
  
}