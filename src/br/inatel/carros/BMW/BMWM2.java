package br.inatel.carros.BMW;

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
                 String chassi, String cambio, int ano, String suspensao, String teto, String rodas, String aerofolio){
        super("BMW", modelo, corInterior, motor, velocidadeMaxima, tracao, cor, preco, chassi, cambio, ano);
        this.suspensao = suspensao;
        this.teto = teto;
        this.rodas = rodas;
        this.aerofolio = aerofolio;
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
        
    }
    
}
