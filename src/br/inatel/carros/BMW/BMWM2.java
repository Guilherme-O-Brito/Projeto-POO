package br.inatel.carros.BMW;

import br.inatel.carros.Carro;
import br.inatel.interfaces.Configurador;

public class BMWM2 extends Carro implements Configurador {

    // Atributos
    private String suspensao;
    private String teto;
    private String rodas;
    private String aerofolio;

    // Metodos
    public BMWM2(){

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
