package br.inatel;

import java.util.ArrayList;
import java.util.List;

import br.inatel.carros.Carro;
import br.inatel.carros.BMW.BMWM2;
import br.inatel.carros.BMW.BMWX6;
import br.inatel.carros.porsche.Porsche718;
import br.inatel.carros.porsche.Porsche911;

public class Comprador {

    // Atributos
    private String nome;
    private String cpf;
    private int idade;
    private List <Carro> carros = new ArrayList<Carro>();
    private static int carrosComprados; // contabiliza quantidade total de carros comprados pelos compradores
    private static float totalArrecadado; // contabiliza quantidade total arrecadada com as vendas
    
    // Construtor
    public Comprador(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    // Metodos
    public void comprar(Carro carro){
        if(carro instanceof Porsche718){
            ((Porsche718)carro).configurador();
        }
        if(carro instanceof Porsche911){
            ((Porsche911)carro).configurador();
        }
        if(carro instanceof BMWM2){
            ((BMWM2)carro).configurador();
        }
        if(carro instanceof BMWX6){
            ((BMWX6)carro).configurador();
        }
        carros.add(carro);
        carrosComprados += 1;
        totalArrecadado += carro.getPreco();
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("///////////////////////////////////////////////////////");
        System.out.println("Lista de compras feitas por esse comprador: ");
        for (Carro carro : carros) {
            if(carro instanceof Porsche718){
                ((Porsche718)carro).mostraInfo();
            }
            if(carro instanceof Porsche911){
                ((Porsche911)carro).mostraInfo();
            }
            if(carro instanceof BMWM2){
                ((BMWM2)carro).mostraInfo();
            }
            if(carro instanceof BMWX6){
                ((BMWX6)carro).mostraInfo();
            }
            System.out.println("///////////////////////////////////////////////////////");
        }
    }

    // Getters
    public static int getCarrosComprados(){
        return carrosComprados;
    }

    public static float getTotalArrecadado(){
        return totalArrecadado;
    }

}
