public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Mariana", 1001);
        conta.depositar(500);
        conta.sacar(150);
        conta.mostrarDados();
    }
}