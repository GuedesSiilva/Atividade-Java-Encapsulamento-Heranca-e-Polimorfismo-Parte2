package ATV_Funcionarios2;

public class Vendedor extends Funcionario{
    private double totalVendas;
    private double percentualComissao;

    public Vendedor(String nome, double salarioBase, double totalVendas, double percentualComissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (totalVendas * percentualComissao);
    }
}
