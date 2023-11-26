package br.inatel.carros.BMW;

import java.util.Scanner;

import br.inatel.Motor.Motor;
import br.inatel.carros.Carro;
import br.inatel.interfaces.Configurador;

public class BMWX6 extends Carro implements Configurador {

    // Atributos
    private String teto;
    private boolean hibrido;
    private String rodas;

    // Construtor para compra pelo metodo configurador
    public BMWX6(){
        super("BMW");
    }

    // Construtor quando le do arquivo
    public BMWX6(String modelo, String corInterior, Motor motor, float velocidadeMaxima, String tracao, String cor, 
                 float preco, String chassi, String cambio, int ano, String teto, boolean hibrido, String rodas){
        super("BMW", modelo, corInterior, motor, velocidadeMaxima, tracao, cor, preco, chassi, cambio, ano);
        this.teto = teto;
        this.hibrido = hibrido;
        this.rodas = rodas;
    }

    // Metodos
    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Chama o método da classe pai para exibir informações comuns a todos os carros
        System.out.println("Teto: " + teto);
        System.out.println("Hibrido: " + (hibrido ? "Sim" : "Não"));
        System.out.println("Rodas: " + rodas);
    }

    @Override
    public String toString(){
        return ":X6" +
               "\n" + super.toString() +
               "\nTeto:" + teto +
               "\nHibrido:" + hibrido +
               "\nRodas:" + rodas;
    }

    @Override
    public void configurador() {
        
        Scanner input = new Scanner(System.in); //input nunca eh fechado devida a isso causar um bug nas leituras da main
        System.out.println("Selecione um modelo da BMW M2: ");
        System.out.println("1 - BMW X6                  : custo R$700.000");
        System.out.println("2 - BMW X6M Competition     : Custo R$1.015.000");

        switch(input.nextInt()) {
            
            case 1:
                this.modelo = "BMW X6";
                this.motor = new Motor(6, "Inline", 340, 45.9f, "Gasolina");
                this.velocidadeMaxima = 250;
                this.tracao = "AWD - xDrive";
                this.preco = 700000;
                this.chassi = "SUV";
                this.cambio = "Automatico ZF8HP";
                this.ano = 2022;
                System.out.println("BMW X6 selecionado!");
                break;

            case 2:
                this.modelo = "BMW X6M Competition";
                this.motor = new Motor(8, "Motor em V", 625, 76.5f, "Gasolina");
                this.velocidadeMaxima = 290;
                this.tracao = "AWD - xDrive";
                this.preco = 1015000;
                this.chassi = "SUV";
                this.cambio = "Automatico ZF8HP";
                this.ano = 2022;
                System.out.println("BMW X6M Competition selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Cancelando compra!!!");
                return;

        }

        System.out.println("Selecione uma das opcoes de cor ");
        System.out.println("1 - Branco com interior Caramelo           : custo R$0");
        System.out.println("2 - Azul com interior Preto        : Custo R$0");

        switch(input.nextInt()) {
            
            case 1:
                this.cor = "Branco";
                this.corInterior = "Caramelo";
                System.out.println("Branco com interior Caramelo selecionado!");
                break;

            case 2:
                this.cor = "Azul";
                this.corInterior = "Preto";
                System.out.println("Azul com interior Preto selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Selecionando opcao padrao: Branco com interior Caramelo");
                this.cor = "Branco";
                this.corInterior = "Caramelo";
        }

        System.out.println("Configurando BMW X6");
        System.out.println("Selecione uma das opcoes de teto: ");
        System.out.println("1 - Teto convencional             : custo R$0");
        System.out.println("2 - Teto Solar                    : Custo R$8.000");

        switch(input.nextInt()) {
            
            case 1:
                this.teto = "Teto convencional";
                System.out.println("Teto convencional selecionado!");
                break;

            case 2:
                this.teto = "Teto Solar";
                this.preco += 8000;
                System.out.println("Teto Solar selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Selecionando opcao padrao: Teto convencional");
                this.teto = "Teto convencional";

        }

        System.out.println("Selecione uma das opcoes de motorizacao: ");
        System.out.println("1 - Motor a combustao convencional             : custo R$0");
        System.out.println("2 - Motor hibrido eletrico/combustao           : Custo R$75.000");

        switch(input.nextInt()) {
            
            case 1:
                this.hibrido = false;
                System.out.println("Motor a combustao convencional selecionado!");
                break;

            case 2:
                this.hibrido = true;
                this.preco += 75000;
                System.out.println("Motor hibrido eletrico/combustao selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Selecionando opcao padrao: Motor a combustao convencional");
                this.hibrido = false;

        }
        
        System.out.println("Selecione uma das opcoes de Rodas: ");
        System.out.println("1 - Rodas convencionais             : custo R$0");
        System.out.println("2 - Rodas Esportivas BMW            : Custo R$5.500");

        switch(input.nextInt()) {
            
            case 1:
                this.rodas = "Rodas convencionais";
                System.out.println("Rodas convencionais selecionado!");
                break;

            case 2:
                this.rodas = "Rodas Esportivas BMW";
                this.preco += 5500;
                System.out.println("Rodas Esportivas BMW selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Selecionando opcao padrao: Rodas convencionais");
                this.rodas = "Rodas convencionais";

        }

    }

}
