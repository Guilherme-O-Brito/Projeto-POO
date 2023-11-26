package br.inatel.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.inatel.Comprador;
import br.inatel.Motor.Motor;
import br.inatel.carros.BMW.BMWM2;
import br.inatel.carros.BMW.BMWX6;
import br.inatel.carros.porsche.Porsche718;
import br.inatel.carros.porsche.Porsche911;

public class Arquivo {
    
    private static Path arquivo;
    //private static String banco = "";

    public static void read(Map <String, Comprador> compradores){
        
        List <String> conteudo;
        
        try {

            conteudo = Files.readAllLines(arquivo);
            String nome = "";
            String cpf ="";
            int idade = 0;

            for(int i=0;i<conteudo.size();i++){
                
                String linha = conteudo.get(i);
                String[] linhaQuebrada = linha.split(":");

                if(linhaQuebrada[1].equals("Comprador")){
                    nome = conteudo.get(i+1).split(":")[1];
                    cpf = conteudo.get(i+2).split(":")[1];
                    idade = Integer.parseInt(conteudo.get(i+3).split(":")[1]);
                    compradores.put(cpf, new Comprador(nome, cpf, idade));
                }

                if(linhaQuebrada[1].equals("911")){
                    compradores.get(cpf).addCarros(new Porsche911(conteudo.get(i+2).split(":")[1], 
                                                                  conteudo.get(i+3).split(":")[1],
                                                                  new Motor(Integer.parseInt(conteudo.get(i+4).split(":")[1]), conteudo.get(i+5).split(":")[1], Integer.parseInt(conteudo.get(i+6).split(":")[1]), Float.parseFloat(conteudo.get(i+7).split(":")[1]), conteudo.get(i+8).split(":")[1]), 
                                                                  Float.parseFloat(conteudo.get(i+9).split(":")[1]), 
                                                                  conteudo.get(i+10).split(":")[1], 
                                                                  conteudo.get(i+11).split(":")[1], 
                                                                  Float.parseFloat(conteudo.get(i+12).split(":")[1]), 
                                                                  conteudo.get(i+13).split(":")[1], 
                                                                  conteudo.get(i+14).split(":")[1], 
                                                                  Integer.parseInt(conteudo.get(i+15).split(":")[1]), 
                                                                  conteudo.get(i+16).split(":")[1], 
                                                                  conteudo.get(i+17).split(":")[1], 
                                                                  conteudo.get(i+18).split(":")[1], 
                                                                  conteudo.get(i+19).split(":")[1]));
                }

                if(linhaQuebrada[1].equals("718")){
                    compradores.get(cpf).addCarros(new Porsche718(conteudo.get(i+2).split(":")[1], 
                                                                  conteudo.get(i+3).split(":")[1],
                                                                  new Motor(Integer.parseInt(conteudo.get(i+4).split(":")[1]), conteudo.get(i+5).split(":")[1], Integer.parseInt(conteudo.get(i+6).split(":")[1]), Float.parseFloat(conteudo.get(i+7).split(":")[1]), conteudo.get(i+8).split(":")[1]), 
                                                                  Float.parseFloat(conteudo.get(i+9).split(":")[1]), 
                                                                  conteudo.get(i+10).split(":")[1], 
                                                                  conteudo.get(i+11).split(":")[1], 
                                                                  Float.parseFloat(conteudo.get(i+12).split(":")[1]), 
                                                                  conteudo.get(i+13).split(":")[1], 
                                                                  conteudo.get(i+14).split(":")[1], 
                                                                  Integer.parseInt(conteudo.get(i+15).split(":")[1]), 
                                                                  conteudo.get(i+16).split(":")[1], 
                                                                  conteudo.get(i+17).split(":")[1], 
                                                                  conteudo.get(i+18).split(":")[1]));                                           
                }

                if(linhaQuebrada[1].equals("M2")){
                    compradores.get(cpf).addCarros(new BMWM2(conteudo.get(i+2).split(":")[1], 
                                                                  conteudo.get(i+3).split(":")[1],
                                                                  new Motor(Integer.parseInt(conteudo.get(i+4).split(":")[1]), conteudo.get(i+5).split(":")[1], Integer.parseInt(conteudo.get(i+6).split(":")[1]), Float.parseFloat(conteudo.get(i+7).split(":")[1]), conteudo.get(i+8).split(":")[1]), 
                                                                  Float.parseFloat(conteudo.get(i+9).split(":")[1]), 
                                                                  conteudo.get(i+10).split(":")[1], 
                                                                  conteudo.get(i+11).split(":")[1], 
                                                                  Float.parseFloat(conteudo.get(i+12).split(":")[1]), 
                                                                  conteudo.get(i+13).split(":")[1], 
                                                                  conteudo.get(i+14).split(":")[1], 
                                                                  Integer.parseInt(conteudo.get(i+15).split(":")[1]), 
                                                                  conteudo.get(i+16).split(":")[1], 
                                                                  conteudo.get(i+17).split(":")[1], 
                                                                  conteudo.get(i+18).split(":")[1], 
                                                                  conteudo.get(i+19).split(":")[1]));
                }

                if(linhaQuebrada[1].equals("X6")){
                    compradores.get(cpf).addCarros(new BMWX6(conteudo.get(i+2).split(":")[1], 
                                                                  conteudo.get(i+3).split(":")[1],
                                                                  new Motor(Integer.parseInt(conteudo.get(i+4).split(":")[1]), conteudo.get(i+5).split(":")[1], Integer.parseInt(conteudo.get(i+6).split(":")[1]), Float.parseFloat(conteudo.get(i+7).split(":")[1]), conteudo.get(i+8).split(":")[1]), 
                                                                  Float.parseFloat(conteudo.get(i+9).split(":")[1]), 
                                                                  conteudo.get(i+10).split(":")[1], 
                                                                  conteudo.get(i+11).split(":")[1], 
                                                                  Float.parseFloat(conteudo.get(i+12).split(":")[1]), 
                                                                  conteudo.get(i+13).split(":")[1], 
                                                                  conteudo.get(i+14).split(":")[1], 
                                                                  Integer.parseInt(conteudo.get(i+15).split(":")[1]), 
                                                                  conteudo.get(i+16).split(":")[1], 
                                                                  Boolean.parseBoolean(conteudo.get(i+17).split(":")[1]), 
                                                                  conteudo.get(i+18).split(":")[1]));
                                                                  

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static void save(Map <String, Comprador> compradores){

        String banco = "";

        for (Map.Entry<String, Comprador> entry : compradores.entrySet()) {
            banco += entry.getValue().toString();
        }

        try {
            Files.writeString(arquivo,banco);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Setters
    public static void setArquivo(String nome){
        arquivo = Paths.get(nome);
    }

}


/*
Comprador
Nome: Guilherme
CPF: 1
Idade: 20
:X6
Montadora:BMW 1
Modelo:BMW X6 2
Cor Interior:Preto 3
Cilindros:6 4
Tipo:Inline 5
Potencia:340 6
Torque:45.9 7 
Combustivel:Gasolina 8
Velocidade Máxima:250.0 9
Tração:AWD - xDrive 10
Cor:Azul 11
Preço:700000.0 12
Chassi:SUV 13
Câmbio:Automatico ZF8HP 14
Ano:2022 15
Teto:Teto convencional 16
Hibrido:false 17
Rodas:Rodas convencionais 18
*/