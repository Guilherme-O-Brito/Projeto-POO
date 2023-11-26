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

    // Metodos
    public BMWM2(String modelo, String corInterior, Motor motor, float velocidadeMaxima, String tracao, String cor, float preco, 
                 String chassi, String cambio, int ano){
        super("BMW", modelo, corInterior, motor, velocidadeMaxima, tracao, cor, preco, chassi, cambio, ano);
    }

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
        
        Scanner input = new Scanner(System.in);
        System.out.println("Configurando BMW M2 " + modelo);
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

        System.out.println("Selecione uma das opcoes de teto: ");
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

        input.close();

    }
    
    // Setters
    public void setSuspensao(String suspensao){
        this.suspensao = suspensao;
    }

    public void setTeto(String teto){
        this.teto = teto;
    }

    public void setRodas(String rodas){
        this.rodas = rodas;
    }

    public void setAerofolio(String aerofolio){
        this.aerofolio = aerofolio;
    }

}
