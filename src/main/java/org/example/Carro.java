package org.example;
/**
 * Classe que representa um Carro, um objeto do mundo real.
 * Esta classe modela as propriedades e comportamentos básicos de um carro,
 * como sua marca, modelo, ano, velocidade e estado (ligado/desligado).
 */
public class Carro {
    // Propriedades do carro
    private String marca;      // Marca do carro (ex.: Toyota, Ford)
    private String modelo;     // Modelo do carro (ex.: Corolla, Mustang)
    private int ano;           // Ano de fabricação do carro
    private double velocidade; // Velocidade atual do carro (em km/h)
    private boolean ligado;    // Estado do carro (true = ligado, false = desligado)

    /**
     * Construtor da classe Carro.
     * Inicializa um carro com marca, modelo, ano e define o carro como desligado com velocidade zero.
     * @param marca A marca do carro
     * @param modelo O modelo do carro
     * @param ano O ano de fabricação do carro
     */
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0;
        this.ligado = false;
    }

    /**
     * Liga o carro, alterando seu estado para ligado.
     * @return Mensagem indicando que o carro foi ligado
     */
    public String ligar() {
        if (!ligado) {
            ligado = true;
            return "Carro ligado!";
        }
        return "O carro já está ligado.";
    }

    /**
     * Desliga o carro, alterando seu estado para desligado e zerando a velocidade.
     * @return Mensagem indicando que o carro foi desligado
     */
    public String desligar() {
        if (ligado) {
            ligado = false;
            velocidade = 0.0;
            return "Carro desligado!";
        }
        return "O carro já está desligado.";
    }

    /**
     * Acelera o carro, aumentando a velocidade em 10 km/h, se o carro estiver ligado.
     * @return Mensagem com a nova velocidade ou aviso se o carro está desligado
     */
    public String acelerar() {
        if (ligado) {
            velocidade += 10.0;
            return "Carro acelerou! Velocidade atual: " + velocidade + " km/h";
        }
        return "Não é possível acelerar. O carro está desligado.";
    }

    /**
     * Freia o carro, reduzindo a velocidade em 10 km/h, se o carro estiver ligado e a velocidade for maior que 0.
     * @return Mensagem com a nova velocidade ou aviso se o carro está desligado ou parado
     */
    public String frear() {
        if (ligado) {
            if (velocidade > 0) {
                velocidade -= 10.0;
                if (velocidade < 0) velocidade = 0;
                return "Carro freou! Velocidade atual: " + velocidade + " km/h";
            }
            return "O carro já está parado.";
        }
        return "Não é possível frear. O carro está desligado.";
    }

    /**
     * Retorna uma descrição do carro com suas propriedades.
     * @return String com as informações do carro
     */
    public String getDescricao() {
        return "Carro: " + marca + " " + modelo + ", Ano: " + ano +
                ", Velocidade: " + velocidade + " km/h, Ligado: " + (ligado ? "Sim" : "Não");
    }
}
