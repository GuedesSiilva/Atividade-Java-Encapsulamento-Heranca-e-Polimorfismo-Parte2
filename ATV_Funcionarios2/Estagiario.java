package ATV_Funcionarios2;

public class Estagiario extends Funcionario {
    private double bolsaAuxilio;

    public Estagiario(String nome, double salarioBase, double bolsaAuxilio) {
        super(nome, salarioBase);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public String getNome() {
        return super.getNome();
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bolsaAuxilio;
    }
    
    @Override 
    public void MostrarDados() {
        System.out.println("--- Dados do Estagiário ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + calcularSalario());
        System.out.println("----------------------------");
    }
}
