package br.inatel.carros.porsche;

import java.util.Scanner;

import br.inatel.Motor.Motor;
import br.inatel.carros.Carro;
import br.inatel.interfaces.Configurador;

public class Porsche718 extends Carro implements Configurador{

    // Atributos
    private String farol;
    private String bancos;
    private String teto;

    // Construtor para compra pelo metodo configurador
    public Porsche718(){
        super("Porsche");
    }

    // Construtor quando le do arquivo
    public Porsche718(String modelo, String corInterior, Motor motor, float velocidadeMaxima, String tracao, String cor,
                      float preco, String chassi, String cambio, int ano, String farol, String bancos, String teto){
        super("Porsche", modelo, corInterior, motor, velocidadeMaxima, tracao, cor, preco, chassi, cambio, ano);
        this.farol = farol;
        this.bancos = bancos;
        this.teto = teto;
    }

    // Metodos
    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Chama o método da classe pai para exibir informações comuns a todos os carros
        System.out.println("Farol: " + farol);
        System.out.println("Bancos: " + bancos);
        System.out.println("Teto: " + teto);
    }

    @Override
    public String toString(){
        return ":718" +
               "\n" + super.toString() +
               "\nFarol:" + farol +
               "\nBancos:" + bancos +
               "\nTeto:" + teto;
    }

    @Override
    public void configurador() {
        
        Scanner input = new Scanner(System.in); //input nunca eh fechado devida a isso causar um bug nas leituras da main
        System.out.println("Selecione um modelo do 718: ");
        System.out.println("1 - 718 Spyder         : custo R$1.238.000");
        System.out.println("2 - 718 Cayman         : Custo R$535.000");

        switch(input.nextInt()) {
            
            case 1:
                this.modelo = "718 Spyder";
                this.motor = new Motor(6, "Boxter", 420, 43, "Gasolina/Etanol");
                this.velocidadeMaxima = 300;
                this.tracao = "Traseira";
                this.preco = 1238000;
                this.chassi = "Conversivel";
                this.cambio = "Automatico PDK";
                this.ano = 2024;
                System.out.println("Porsche 718 Spyder selecionado!");
                break;

            case 2:
                this.modelo = "718 Cayman";
                this.motor = new Motor(4, "Boxter", 300, 38, "Gasolina/Etanol");
                this.velocidadeMaxima = 275;
                this.tracao = "Traseira";
                this.preco = 535000;
                this.chassi = "Coupe";
                this.cambio = "Automatico PDK";
                this.ano = 2024;
                System.out.println("Porsche 718 Cayman selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Cancelando compra!!!");
                return;

        }

        System.out.println("Selecione uma das opcoes de cor ");
        System.out.println("1 - Preto com interior caramelo         : custo R$0");
        System.out.println("2 - Branco com interior vermelho        : Custo R$0");

        switch(input.nextInt()) {
            
            case 1:
                this.cor = "Preto";
                this.corInterior = "Caramelo";
                System.out.println("Preto com interior caramelo selecionado!");
                break;

            case 2:
                this.cor = "Branco";
                this.corInterior = "Vermelho";
                System.out.println("Branco com interior vermelho selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Selecionando opcao padrao: Preto com interior caramelo");
                this.cor = "Preto";
                this.corInterior = "Caramelo";
        }

        System.out.println("Configurando Porsche 718");
        System.out.println("Selecione uma das opcoes de farol: ");
        System.out.println("1 - Farol convencional : custo R$0");
        System.out.println("2 - Farol Xenon        : Custo R$3.700");

        switch(input.nextInt()) {
            
            case 1:
                this.farol = "Farol convencional";
                System.out.println("Farol Convencional selecionado!");
                break;

            case 2:
                this.farol = "Farol Xenon";
                this.preco += 3700;
                System.out.println("Farol Xenon selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Selecionando opcao padrao: Faraol convencional");
                this.farol = "Farol convencional";

        }

        System.out.println("Selecione uma das opcoes de bancos: ");
        System.out.println("1 - Bancos convencionais             : custo R$0");
        System.out.println("2 - Bancos Concha de corrida        : Custo R$28.000");
        
        switch(input.nextInt()) {
            
            case 1:
                this.bancos = "Bancos convencionais";
                System.out.println("Bancos convencionais selecionado!");
                break;

            case 2:
                this.bancos = "Bancos Concha de corrida";
                this.preco += 28000;
                System.out.println("Bancos Concha de corrida selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Selecionando opcao padrao: Bancos convencionais");
                this.bancos = "Bancos convencionais";

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
        
    }
    
}
