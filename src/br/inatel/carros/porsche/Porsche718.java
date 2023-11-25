package br.inatel.carros.porsche;

import br.inatel.carros.Carro;
import br.inatel.interfaces.Configurador;

public class Porsche718 extends Carro implements Configurador{

    // Atributos
    private String farol;
    private String bancos;
    private String teto;

    // Metodos
    public Porsche718(){

    }

    public void mostraInfo(){
        super.mostraInfo();
        
    }

    @Override
    public void configurador() {
        
    }
    
}
