package ATV_Veiculos;

public class Veiculos {
    private String marca;
    private String modelo;
    private int velocidade;
    private boolean ligado;

    public Veiculos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O veículo está ligado.");
    }

    public void desligar() {
        if (velocidade == 0) {
            ligado = false;
            System.out.println("O veículo está desligado.");
        }
        else if(velocidade > 0) {
            System.out.println("Não é possível desligar o veículo enquanto ele estiver em movimento.");
        }
    }

    public void acelerar() {
        if (ligado) {
            velocidade += 10;
        }
        System.out.println("A velocidade atual é: " + velocidade + " km/h");
    }

    public void frear() {
        if (velocidade >= 10) {
            velocidade -= 10;
        } else {
            velocidade = 0;
        }
        System.out.println("A velocidade atual é: " + velocidade + " km/h");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }
}