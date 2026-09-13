package ATV_FormasGeometricas;

public class Main {
    public static void main(String[] args) {
        Forma forma1 = new Retangulo(10, 5.0);
        Forma forma2 = new Circulo(3.0);

       System.out.println("Área do retângulo: " + forma1.CalcularArea());
        System.out.println("Área do círculo: " + forma2.CalcularArea());
    }
}
