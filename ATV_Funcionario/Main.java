package ATV_Funcionario;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Geovanna", 8000.0, "Vendas");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Guedes", 5000.0, "Java");

        gerente.MostrarDados();
        gerente.RealizarReuniao();

        System.out.println();

        desenvolvedor.MostrarDados();
        desenvolvedor.Programar();
    }
}
