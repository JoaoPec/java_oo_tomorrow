package app;

import models.Carro;

public class CarroTeste{

    public static void main(String[] args) {
        // Criando uma instância da classe Carro
        Carro meuCarro = new Carro("Toyota");

        // Testando os métodos da classe Carro
        meuCarro.setLigado(true);
        meuCarro.acelerar(50);
        System.out.println("Velocidade atual: " + meuCarro.getVelocidade() + " km/h");

        meuCarro.virarCarro(true); // Virar para a direita
        meuCarro.virarCarro(false); // Virar para a esquerda

        meuCarro.mudarMarcha(true); // Subir a marcha
        meuCarro.mudarMarcha(false); // Descer a marcha

        // Exibindo informações do carro
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Velocidade: " + meuCarro.getVelocidade() + " km/h");
        System.out.println("Aceleração: " + meuCarro.getAceleracao());
        meuCarro.getMarcha();
        System.out.println("Ligado: " + meuCarro.isLigado());
    }
}