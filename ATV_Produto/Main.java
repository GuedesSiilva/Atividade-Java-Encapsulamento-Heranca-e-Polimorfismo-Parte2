package ATV_Produto;

public class Main {
    
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.00, 10);
        produto.MostrarDados();
        
        System.out.println("\nAlterando o preço do produto para R$ 3000.00...");
        produto.AlterPreco(3000.00);
        produto.MostrarDados();
        
        System.out.println("\nAdicionando 5 unidades ao estoque...");
        produto.AdicionarEstoque(5);
        produto.MostrarDados();
        
        System.out.println("\nRetirando 3 unidades do estoque...");
        produto.RetirarEstoque(3);
        produto.MostrarDados();
    }
}
