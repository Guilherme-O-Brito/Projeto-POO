package br.inatel.carros.BMW;

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
        
    }
    
}
