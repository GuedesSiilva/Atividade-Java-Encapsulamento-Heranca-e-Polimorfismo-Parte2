package ATV_Aluno;

public class Aluno {
    private String nome;
    private double PrimeiraNota;
    private double SegundaNota;

    public Aluno(String nome, double PrimeiraNota, double SegundaNota) {
        this.nome = nome;
        this.PrimeiraNota = PrimeiraNota;
        this.SegundaNota = SegundaNota;
    }

    public void setPrimeiraNota(double PrimeiraNota) {
        if (PrimeiraNota >= 0 && PrimeiraNota <= 10) {
            this.PrimeiraNota = PrimeiraNota;
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }

    public void setSegundaNota(double SegundaNota) {
        if (SegundaNota >= 0 && SegundaNota <= 10) {
            this.SegundaNota = SegundaNota;
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }

    public double CalcularMedia() {
        return (PrimeiraNota + SegundaNota) / 2;
    }

    public void MostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Primeira Nota: " + PrimeiraNota);
        System.out.println("Segunda Nota: " + SegundaNota);
        System.out.println("Média: " + CalcularMedia());
    }
}
