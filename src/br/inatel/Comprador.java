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
    /**
     * Este metodo serve para adicionar um carro recebido como parametro na lista de carros do comprador atraves de uma venda
     * Este identifica o tipo de carro atravez da instancia do carro recebido e chama o seu respectivo configurador para calculo de valores extras do carro
     * Depois adiciona este carro na lista e soma o total arrecadado pela loja
     * @param carro
     */
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

    /**
     * Mostra na tela todos atributos do comprador incluindo os carros que ele tem comprado seguido de seus atributos
     */
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

    /**
     * Este metodo retorna uma String concatenada com todos os atributos presentes no comprador
     * separados por quebras de linha no padrao:
     * :Comprador (Indicando que esta no inicio da descricao de um comprador)
     * Nome:Gui (Primeiro uma string indicando qual atributo esta na linha separando o valor por um :)
     * cpf:123 
     * idade:20 
     * :(Carro comprado) (indica que agora aparecerao os atributos de um dos carros que este comprador comprou seduindo o mesmo padrao de apresentacao dos atributos do comprador)
     */
    public String toString(){

        String carrosToString = "";

        for (Carro carro : carros) {
            if(carro instanceof Porsche718){
                carrosToString += "\n" + ((Porsche718)carro).toString();
            }
            if(carro instanceof Porsche911){
                carrosToString += "\n" + ((Porsche911)carro).toString();
            }
            if(carro instanceof BMWM2){
                carrosToString += "\n" + ((BMWM2)carro).toString();
            }
            if(carro instanceof BMWX6){
                carrosToString += "\n" + ((BMWX6)carro).toString();
            }
        }

        return ":Comprador" +
               "\nNome:" + nome +
               "\nCPF:" + cpf +
               "\nIdade:" + idade +
               carrosToString + "\n";
    }

    /**
     * Meio alternativo de adicionar carros na lista de compras de um comprador sem ser atravez do metodo comprar
     * Utilizado especificamente para adicionar os carros lidos no arquivo no momento inicial do codigo
     * @param carro
     */
    public void addCarros(Carro carro){
        carros.add(carro);
        carrosComprados += 1;
        totalArrecadado += carro.getPreco();
    }

    // Getters e setters
    public static int getCarrosComprados(){
        return carrosComprados;
    }

    public static float getTotalArrecadado(){
        return totalArrecadado;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

}
