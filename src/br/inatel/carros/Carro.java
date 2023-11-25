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
    public Carro(){

    }

    public void mostraInfo(){

    }

}
