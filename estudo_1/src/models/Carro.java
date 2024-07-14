package models;

public class Carro{

    private String modelo;
    private int velocidade;
    private int aceleracao;
    private boolean marcha;
    private boolean ligado;

    public Carro(String mo){
        this.modelo = mo;
        this.apresentarCarro();
    }

    private void apresentarCarro(){
        System.out.println("Seja bem vindo ao seu carro!\n Para virar a esquerda, passe false, para a direita, true\n Para mudar a marcha para cima, true, para baixo, false");
    }

    public void acelerar(int v){

        System.out.println("Acelerando " + v + " km/h");

        this.velocidade += v;

    }

    public void virarCarro(boolean c){
        if (c){
            System.out.println("Virando para a direita...");
        }
    }

    public void mudarMarcha(boolean c){
        if (c){
            System.out.println("Levantando a marcha...");
        }
        System.out.println("Abaixando a marcha...");
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public void setLigado(boolean c){
        this.ligado = c;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public boolean getMarcha() {

        if (!marcha){
            System.out.println("Marcha para baixo");
            return marcha;
        }

        System.out.println("Marcha para cima");
        return marcha;
    }

    public void setMarcha(boolean marcha) {
        this.marcha = marcha;
    }

    public boolean isLigado() {
        return ligado;
    }
}