package br.inatel.carros.porsche;

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
                      String chassi, String cambio, int ano, String farol, String bancos, String teto, String aerofolio, String suspensao){
        super("Porsche", modelo, corInterior, motor, velocidadeMaxima, tracao, cor, preco, chassi, cambio, ano);
        this.farol = farol;
        this.bancos = bancos;
        this.aerofolio = aerofolio;
        this.suspensao = suspensao;
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
        
    }
    
}
