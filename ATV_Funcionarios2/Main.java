package ATV_Funcionarios2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Gerente("Guedes", 9000, 1000);
        Funcionario funcionario2 = new Vendedor("Geovanna", 3000, 10000, 0.1);
        Funcionario funcionario3 = new Estagiario("Arthur",950, 200);
        funcionario1.MostrarDados();
        funcionario2.MostrarDados();
        funcionario3.MostrarDados();
    }
}
