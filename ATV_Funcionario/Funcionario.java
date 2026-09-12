package ATV_Funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void MostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
