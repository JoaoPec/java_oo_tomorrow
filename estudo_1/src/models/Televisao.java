package models;

public class Televisao {
        private double tamanhoTela;
        private int volume;
        private String marca;
        private int voltagem;
        private int canal;

        // Construtor
        public Televisao(double tamanhoTela, String marca, int voltagem, int canal) {
            this.tamanhoTela = tamanhoTela;
            this.volume = 5; // Volume inicial é 5
            this.marca = marca;
            this.voltagem = voltagem;
            this.canal = canal;
        }

        // Getters e Setters
        public double getTamanhoTela() {
            return tamanhoTela;
        }

        public void setTamanhoTela(double tamanhoTela) {
            this.tamanhoTela = tamanhoTela;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            if(volume >= 1 && volume <= 10) {
                this.volume = volume;
            } else {
                System.out.println("Volume deve estar entre 1 e 10.");
            }
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getVoltagem() {
            return voltagem;
        }

        public void setVoltagem(int voltagem) {
            if(voltagem == 110 || voltagem == 220) {
                this.voltagem = voltagem;
            } else {
                System.out.println("Voltagem deve ser 110 ou 220.");
            }
        }

        public int getCanal() {
            return canal;
        }

        public void setCanal(int canal) {
            this.canal = canal;
        }

        // Método para mostrar informações da TV
        public void mostrarInfo() {
            System.out.println("Marca: " + marca);
            System.out.println("Tamanho da Tela: " + tamanhoTela + " polegadas");
            System.out.println("Volume: " + volume);
            System.out.println("Voltagem: " + voltagem + "V");
            System.out.println("Canal: " + canal);
        }
}