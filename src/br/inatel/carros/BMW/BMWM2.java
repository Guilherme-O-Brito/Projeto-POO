package br.inatel.carros.BMW;

import java.util.Scanner;

import br.inatel.Motor.Motor;
import br.inatel.carros.Carro;
import br.inatel.interfaces.Configurador;

public class BMWM2 extends Carro implements Configurador {

    // Atributos
    private String suspensao;
    private String teto;
    private String rodas;
    private String aerofolio;

    
    // Construtor para compra pelo metodo configurador
    public BMWM2(){
        super("BMW");
    }

    // Construtor quando le do arquivo
    public BMWM2(String modelo, String corInterior, Motor motor, float velocidadeMaxima, String tracao, String cor, float preco, 
                 String chassi, String cambio, int ano, String suspensao, String teto, String rodas, String aerofolio){
        super("BMW", modelo, corInterior, motor, velocidadeMaxima, tracao, cor, preco, chassi, cambio, ano);
        this.suspensao = suspensao;
        this.teto = teto;
        this.rodas = rodas;
        this.aerofolio = aerofolio;
    }

    // Metodos
    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Chama o método da classe pai para exibir informações comuns a todos os carros
        System.out.println("Suspensão: " + suspensao);
        System.out.println("Teto: " + teto);
        System.out.println("Rodas: " + rodas);
        System.out.println("Aerofólio: " + aerofolio);
    }

    @Override
    public void configurador() {
        
        Scanner input = new Scanner(System.in); //input nunca eh fechado devida a isso causar um bug nas leituras da main
        System.out.println("Selecione um modelo da BMW M2: ");
        System.out.println("1 - BMW M2 Competition        : custo R$454.181");
        System.out.println("2 - BMW M2 CS                 : Custo R$800.000");

        switch(input.nextInt()) {
            
            case 1:
                this.modelo = "BMW M2 Competition";
                this.motor = new Motor(6, "Inline", 410, 56, "Gasolina");
                this.velocidadeMaxima = 280;
                this.tracao = "Traseira";
                this.preco = 454181;
                this.chassi = "Coupe";
                this.cambio = "Automatico Dupla Embreagem";
                this.ano = 2020;
                System.out.println("BMW M2 Competition selecionado!");
                break;

            case 2:
                this.modelo = "BMW M2 CS";
                this.motor = new Motor(6, "Inline", 450, 46.5f, "Gasolina");
                this.velocidadeMaxima = 280;
                this.tracao = "Traseira";
                this.preco = 800000;
                this.chassi = "Coupe";
                this.cambio = "Manual 6 Marchas";
                this.ano = 2021;
                System.out.println("BMW M2 CS selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Cancelando compra!!!");
                return;

        }

        System.out.println("Selecione uma das opcoes de cor ");
        System.out.println("1 - Branco com interior Caramelo           : custo R$0");
        System.out.println("2 - Azul com interior Preto                : Custo R$0");

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

        System.out.println("Configurando BMW M2");
        System.out.println("Selecione uma das opcoes de suspensao: ");
        System.out.println("1 - Suspensao convencional                           : custo R$0");
        System.out.println("2 - Suspensao coilover de corrida                    : Custo R$58.000");

        switch(input.nextInt()) {
            
            case 1:
                this.suspensao = "Suspensao convencional";
                System.out.println("Suspensao convencional selecionado!");
                break;

            case 2:
                this.suspensao = "Suspensao coilover de corrida";
                this.preco += 58000;
                System.out.println("Suspensao coilover de corrida selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Selecionando opcao padrao: Suspensao convencional");
                this.suspensao = "Suspensao convencional";

        }

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

        System.out.println("Selecione uma das opcoes de rodas: ");
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

        System.out.println("Selecione uma das opcoes de aerofolio: ");
        System.out.println("1 - Aerofolio convencional                           : custo R$0");
        System.out.println("2 - Aerofolio Esportivo BMW                          : Custo R$2.100");

        switch(input.nextInt()) {
            
            case 1:
                this.aerofolio = "Aerofolio convencional";
                System.out.println("Aerofolio convencional selecionado!");
                break;

            case 2:
                this.aerofolio = "Aerofolio Esportivo BMW";
                this.preco += 2100;
                System.out.println("Aerofolio Esportivo BMW selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Selecionando opcao padrao: Aerofolio convencional");
                this.aerofolio = "Aerofolio convencional";

        }

    }

}
