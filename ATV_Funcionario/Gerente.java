package ATV_Funcionario;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void RealizarReuniao() {
        System.out.println("O gerente " + getNome() + " está realizando uma reunião no setor: " + setor);
    }
    
}
