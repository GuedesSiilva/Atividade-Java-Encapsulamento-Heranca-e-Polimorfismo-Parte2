package ATV_Funcionarios2;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        if(salarioBase < 0){
            throw new IllegalArgumentException("O salário base não pode ser negativo.");
        }
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
    public void MostrarDados() {
        System.out.println("--- Dados do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + calcularSalario());
        System.out.println("----------------------------");
    }

    public String getNome() {
        return nome;
    }
}
