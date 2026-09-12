package ATV_Veiculos;

public class Moto extends Veiculos {
    private int cilindradas;

    public Moto(String marca, String modelo,
            int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void empinar() {
        System.out.println("A moto está empinando.");
    }

    public int getCilindradas() {
        return cilindradas;
    }
}