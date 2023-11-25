package br.inatel;

import br.inatel.carros.Carro;

public class Comprador {

    // Atributos
    private String nome;
    private String cpf;
    private int idade;
    private Carro[] carros = new Carro[100];
    public static int carrosComprados; // contabiliza quantidade total de carros comprados pelos compradores
    
    // Metodos
    public Comprador(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void comprar(Carro carro){

    }

}
