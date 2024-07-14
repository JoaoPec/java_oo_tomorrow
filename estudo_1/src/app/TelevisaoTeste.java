package app;

import models.Televisao;

public class TelevisaoTeste {
    public static void main(String[] args) {
        // Criando uma instância da classe Televisao
        Televisao minhaTv = new Televisao(55.0, "Samsung", 220, 10);

        // Exibindo informações iniciais da TV
        System.out.println("Informações iniciais da TV:");
        minhaTv.mostrarInfo();

        // Testando ajustes de volume e canal
        System.out.println("\nAjustando volume para 7 e canal para 15:");
        minhaTv.setVolume(7);
        minhaTv.setCanal(15);
        minhaTv.mostrarInfo();

        // Testando ajuste de volume fora dos limites
        System.out.println("\nTentando ajustar volume para 11:");
        minhaTv.setVolume(11); // Deveria exibir uma mensagem de erro

        // Testando ajuste de voltagem para valor inválido
        System.out.println("\nTentando ajustar voltagem para 150:");
        minhaTv.setVoltagem(150); // Deveria exibir uma mensagem de erro

        // Ajustando a voltagem para um valor válido
        System.out.println("\nAjustando voltagem para 110:");
        minhaTv.setVoltagem(110);
        minhaTv.mostrarInfo();

        // Exibindo informações finais da TV
        System.out.println("\nInformações finais da TV:");
        minhaTv.mostrarInfo();
    }
}
