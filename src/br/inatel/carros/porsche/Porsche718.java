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

    @Override
    public void mostraInfo() {
        super.mostraInfo(); // Chama o método da classe pai para exibir informações comuns a todos os carros
        System.out.println("Farol: " + farol);
        System.out.println("Bancos: " + bancos);
        System.out.println("Teto: " + teto);
    }

    @Override
    public void configurador() {
        
    }
    
}
