package ATV_Produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public void AlterPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido. O preço deve ser maior que zero.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void AdicionarEstoque(int quantidade) {
        if( quantidade < 0) {
            System.out.println("Quantidade inválida. A quantidade não pode ser negativa.");
            return;
        }
        this.quantidade += quantidade;
    }
    public void RetirarEstoque(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade inválida. A quantidade não pode ser negativa.");
            return;
        }
        if (quantidade > this.quantidade) {
            System.out.println("Quantidade insuficiente em estoque. Não é possível retirar " + quantidade + " unidades.");
            return;
        }
        this.quantidade -= quantidade;
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }
    
    public void MostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor total em estoque: R$ " + calcularValorEstoque());
    }
}
