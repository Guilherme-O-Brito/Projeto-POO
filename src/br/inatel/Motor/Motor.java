package br.inatel.Motor;

public class Motor {

    // Atributos
    private int cilindros;
    private String tipo; // inline 6, V6, V8, inline 4
    private int potencia; // medida em cavalos ou HP
    private float torque; // medida em kgfm
    private String combustivel;

    // Construtor
    public Motor(int cilindros, String tipo, int potencia, float torque, String combustivel){
        this.cilindros = cilindros;
        this.tipo = tipo;
        this.potencia = potencia;
        this.torque = torque;
        this.combustivel = combustivel;
    }

    
}
