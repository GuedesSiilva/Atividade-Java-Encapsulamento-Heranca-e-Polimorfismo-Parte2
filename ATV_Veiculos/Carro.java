package ATV_Veiculos;

public class Carro extends Veiculos {
    private int quantidadePortas;

    public Carro(String marca, String modelo,
            int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void abrirPortaMalas(int velocidade) {
        if(velocidade == 0) {
            System.out.println("Porta-malas aberto.");
        } else {
            System.out.println("Não é possível abrir o porta-malas enquanto o carro estiver em movimento.");
        }
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }
}