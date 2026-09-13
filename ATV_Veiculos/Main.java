package ATV_Veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 4);
        Moto moto = new Moto("Honda", "CG 160", 160);
        carro.ligar();
        carro.acelerar();
        carro.abrirPortaMalas(carro.getVelocidade());
        carro.frear();
        carro.desligar();
        carro.abrirPortaMalas(carro.getVelocidade());
        moto.ligar();
        moto.acelerar();
        moto.empinar(); 

        Veiculos veiculo1 = new Carro("Chevrolet", "Onix", 4);
        Veiculos veiculo2 = new Moto("Yamaha", "MT-07", 689);
        veiculo1.mover();
        veiculo2.mover();
    }
}
