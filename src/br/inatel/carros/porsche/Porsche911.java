package br.inatel.carros.porsche;

import java.util.Scanner;

import br.inatel.Motor.Motor;
import br.inatel.carros.Carro;
import br.inatel.interfaces.Configurador;

public class Porsche911 extends Carro implements Configurador{

    // Atributos
    private String farol;
    private String bancos;
    private String aerofolio;
    private String suspensao;

    // Metodos
    public Porsche911(String modelo, String corInterior, Motor motor, float velocidadeMaxima, String tracao, String cor, float preco,
                      String chassi, String cambio, int ano){
        super("Porsche", "911 "+modelo, corInterior, motor, velocidadeMaxima, tracao, cor, preco, chassi, cambio, ano);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Chama o método da classe pai para exibir informações comuns a todos os carros
        System.out.println("Farol: " + farol);
        System.out.println("Bancos: " + bancos);
        System.out.println("Aerofólio: " + aerofolio);
        System.out.println("Suspensão: " + suspensao);
    }

    @Override
    public void configurador() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Configurando Porsche " + modelo);
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

        System.out.println("Selecione uma das opcoes de aerofolio: ");
        System.out.println("1 - Aerofolio convencional                           : custo R$0");
        System.out.println("2 - Aerofolio com tecnologia DRS de Formula 1        : Custo R$112.000");

        switch(input.nextInt()) {
            
            case 1:
                this.aerofolio = "Aerofolio convencional";
                System.out.println("Aerofolio convencional selecionado!");
                break;

            case 2:
                this.aerofolio = "Aerofolio com tecnologia DRS de Formula 1";
                this.preco += 112000;
                System.out.println("Aerofolio com tecnologia DRS de Formula 1 selecionado!");
                break;

            default:
                System.out.println("Opcao invalida!!! Selecionando opcao padrao: Aerofolio convencional");
                this.aerofolio = "Aerofolio convencional";

        }

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

        input.close();

    }

    // Setters
    
    public void setFarol(String farol){
        this.farol = farol;
    }
    
    public void setBancos(String bancos){
        this.bancos = bancos;
    }
    
    public void setAerofolio(String aerofolio){
        this.aerofolio = aerofolio;
    }
    
    public void setSuspensao(String suspensao){
        this.suspensao = suspensao;
    }
    
}
