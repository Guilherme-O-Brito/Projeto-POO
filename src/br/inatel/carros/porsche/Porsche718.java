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

    // Construtor quando le do txt
    public Porsche718(String modelo, String corInterior, Motor motor, float velocidadeMaxima, String tracao, String cor,
                      float preco, String chassi, String cambio, int ano){
        super("Porsche", "718 "+modelo, corInterior, motor, velocidadeMaxima, tracao, cor, preco, chassi, cambio, ano);
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
    public void configurador() {
        Scanner input = new Scanner(System.in);
        System.out.println("Configurando Porsche 718 " + modelo);
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

        System.out.println("Selecione uma das opcoes de bancosteto: ");
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

        input.close();
    }

    // Setters
    public void setFarol(String farol){
        this.farol = farol;
    }

    public void setBancos(String bancos){
        this.bancos = bancos;
    }

    public void setTeto(String teto){
        this.teto = teto;
    }
    
}
