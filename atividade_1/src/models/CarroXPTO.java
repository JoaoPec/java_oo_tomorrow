package models;

import java.time.LocalDate;
import java.util.Scanner;

public class CarroXPTO {

    private int codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int anoDeFabricacao;
    private int numeroPortas;
    private String tipoDeCombustivel;
    private int quantidadeDisponivel;
    private float preco;
    private String completoOuBasico; // Alterado para String

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do carro: ");
        setCodigo(scanner.nextInt());
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Digite a marca do carro: ");
        setMarca(scanner.nextLine());

        System.out.print("Digite a cor do carro: ");
        setCor(scanner.nextLine());

        System.out.print("Digite o modelo do carro: ");
        setModelo(scanner.nextLine());

        System.out.print("Digite o ano de fabricação do carro: ");
        setAnoDeFabricacao(scanner.nextInt());
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Digite o número de portas do carro: ");
        setNumeroPortas(scanner.nextInt());
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Digite o tipo de combustível do carro (gasolina ou etanol): ");
        setTipoDeCombustivel(scanner.nextLine());
        while (!getTipoDeCombustivel().equalsIgnoreCase("gasolina") && !getTipoDeCombustivel().equalsIgnoreCase("etanol")) {
            System.out.print("Tipo inválido de combustível. Digite novamente (gasolina ou etanol): ");
            setTipoDeCombustivel(scanner.nextLine());
        }

        System.out.print("Digite a quantidade disponível do carro: ");
        setQuantidadeDisponivel(scanner.nextInt());
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Digite o preço do carro: ");
        setPreco(scanner.nextFloat());
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("O carro é completo ou básico? (completo ou básico): ");
        setCompletoOuBasico(scanner.nextLine());

        System.out.println("\nCarro cadastrado com sucesso!\n");
    }

    public void listar() {
        System.out.println("Informações do Carro:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Cor: " + getCor());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoDeFabricacao());
        System.out.println("Número de Portas: " + getNumeroPortas());
        System.out.println("Tipo de Combustível: " + getTipoDeCombustivel());
        System.out.println("Quantidade Disponível: " + getQuantidadeDisponivel());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Completo ou Básico: " + isCompletoOuBasico());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        LocalDate dataAtual = LocalDate.now();
        if (anoDeFabricacao > dataAtual.getYear() || anoDeFabricacao <= 0 || anoDeFabricacao <= 1886) {
            System.out.println("Ano de fabricação inválido.");
            return;
        }
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        if (numeroPortas > 4 || numeroPortas < 2) {
            System.out.println("Número inválido de portas");
            return;
        }
        this.numeroPortas = numeroPortas;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        if (!tipoDeCombustivel.equalsIgnoreCase("gasolina") && !tipoDeCombustivel.equalsIgnoreCase("etanol")) {
            System.out.println("Tipo inválido de combustível. Deve ser gasolina ou etanol.");
            return;
        }
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String isCompletoOuBasico() { // Corrigido para retornar String
        return completoOuBasico;
    }

    public void setCompletoOuBasico(String completoOuBasico) { // Alterado para receber String
        this.completoOuBasico = completoOuBasico;
    }
}
