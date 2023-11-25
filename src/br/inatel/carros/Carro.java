package br.inatel.carros;

import br.inatel.Motor.Motor;

public abstract class Carro {
    
    // Atributos
    protected String montadora;
    protected String modelo;
    protected String corInterior;
    protected Motor motor;
    protected float velocidadeMaxima;
    protected String tracao;
    protected String cor;
    protected float preco;
    protected String chassi;
    protected String cambio;
    protected int ano;

    // metodos
    public Carro(String montadora, String modelo, String corInterior, Motor motor, float velocidadeMaxima, String tracao, String cor, float preco, String chassi, String cambio, int ano) {
        this.montadora = montadora;
        this.modelo = modelo;
        this.corInterior = corInterior;
        this.motor = motor;
        this.velocidadeMaxima = velocidadeMaxima;
        this.tracao = tracao;
        this.cor = cor;
        this.preco = preco;
        this.chassi = chassi;
        this.cambio = cambio;
        this.ano = ano;
    }

    public void mostraInfo() {
        System.out.println("Montadora: " + montadora);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor Interior: " + corInterior);
        System.out.println("Motor: ");
        motor.mostraInfo();
        System.out.println("Velocidade Máxima: " + velocidadeMaxima);
        System.out.println("Tração: " + tracao);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);
        System.out.println("Chassi: " + chassi);
        System.out.println("Câmbio: " + cambio);
        System.out.println("Ano: " + ano);
    }

}
