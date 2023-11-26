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

    // Metodos
    public BMWX6(String modelo, String corInterior, Motor motor, float velocidadeMaxima, String tracao, String cor, 
                 float preco, String chassi, String cambio, int ano, String teto, boolean hibrido, String rodas){
        super("BMW", modelo, corInterior, motor, velocidadeMaxima, tracao, cor, preco, chassi, cambio, ano);
        this.teto = teto;
        this.hibrido = hibrido;
        this.rodas = rodas;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Chama o método da classe pai para exibir informações comuns a todos os carros
        System.out.println("Teto: " + teto);
        System.out.println("Híbrido: " + (hibrido ? "Sim" : "Não"));
        System.out.println("Rodas: " + rodas);
    }

    @Override
    public void configurador() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Configurando BMW X6 " + modelo);
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

        input.close();

    }
    
    // Setters
    public void setTeto(String teto){
        this.teto = teto;
    }

    public void setHibrido(boolean hibrido){
        this.hibrido = hibrido;
    }

    public void setRodas(String rodas){
        this.rodas = rodas;
    }

}
