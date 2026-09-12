package ATV_Funcionario;

public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void Programar() {
        System.out.println("O desenvolvedor " + getNome() + " está codificando em " + linguagem);
    }
    
}
