import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.inatel.Comprador;
import br.inatel.Utils.Arquivo;
import br.inatel.Utils.ClearScreen;
import br.inatel.carros.BMW.BMWM2;
import br.inatel.carros.BMW.BMWX6;
import br.inatel.carros.porsche.Porsche718;
import br.inatel.carros.porsche.Porsche911;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        //Variaveis para entrada de dados
        Scanner input = new Scanner(System.in);
        int opcao; // Variavei para armazenar as escolhas do usuario no menu
        String pause; // Variavel apenas para gerar um "Pause" na execucao do codigo
        // Variavel auxiliar para operacoes com os compradores
        Comprador comprador;
        // Mapa de compradores da loja cuja chave eh o cpf de cada comprador em string
        Map <String, Comprador> compradores = new HashMap<>();
        // Configura nome do arquivo de banco de dados e le o mesmo
        Arquivo.setArquivo("Banco.txt");
        Arquivo.read(compradores);
        
        // Menu de interacao com o ususario
        do{
            
            System.out.println("Concessionária Santa Rita Imports");
            System.out.println("1 - Fazer uma venda");
            System.out.println("2 - Consultar vendas feitas para um cliente especifico");
            System.out.println("3 - Mostrar compradores cadastrados");
            System.out.println("4 - Verificar total arrecadado em vendas");
            System.out.println("0 - Sair");
            
            opcao = input.nextInt();

            switch(opcao) {
                
                case 1:
                    ClearScreen.cls();
                    // Variaveis auxiliares para criacao de compradores
                    String nome;
                    String cpf;
                    int idade;
                    System.out.print("Insira o cpf do comprador: ");
                    input.nextLine(); //limpa buffer
                    cpf = input.nextLine();
                    if(compradores.get(cpf) == null){
                        System.out.println("Cliente nao encontrado por favor termine o cadastro do novo cliente!");
                        System.out.print("Digite o nome do novo comprador: ");
                        nome = input.nextLine();
                        System.out.print("Digite a idade do novo comprador: ");
                        idade = input.nextInt();
                        compradores.put(cpf, new Comprador(nome, cpf, idade));
                        System.out.println("Cliente cadastrado por favor prossiga com a compra");
                        System.out.println("Pressione qualquer coisa para continuar");
                        input.nextLine(); //limpa buffer
                        pause = input.nextLine();
                        ClearScreen.cls();
                    }

                    comprador = compradores.get(cpf);

                    System.out.println("Selecione o carro a ser vendido ao cliente: ");
                    System.out.println("1 - Porsche 718");
                    System.out.println("2 - Porsche 911");
                    System.out.println("3 - BMW M2");
                    System.out.println("4 - BMW X6");

                    switch(input.nextInt()){

                        case 1:
                            comprador.comprar(new Porsche718());
                            break;
                        
                        case 2:
                            comprador.comprar(new Porsche911());
                            break;
                        
                        case 3:
                            comprador.comprar(new BMWM2());
                            break;
                        
                        case 4:
                            comprador.comprar(new BMWX6());
                            break;    

                    }

                    Arquivo.save(compradores); // Salva alteracoes no arquivo
                    System.out.println("Venda efetuada com sucesso!");
                    System.out.println("Pressione qualquer coisa para continuar");
                    input.nextLine(); //limpa buffer
                    pause = input.nextLine();
                    ClearScreen.cls();
                    break;
                
                case 2:
                    ClearScreen.cls();
                    System.out.print("Digite o cpf do comprador que deseja consultar: ");
                    input.nextLine(); //limpa buffer
                    comprador = compradores.get(input.nextLine());
                    if(comprador != null){
                        comprador.mostraInfo();
                        System.out.println("Pressione qualquer coisa para continuar");
                        pause = input.nextLine();
                        ClearScreen.cls();
                    }else{
                        System.out.println("Comprador nao encontrado!");
                        System.out.println("Pressione qualquer coisa para continuar");
                        pause = input.nextLine();
                        ClearScreen.cls();
                    }
                    break;
                
                case 3:
                    ClearScreen.cls();
                    System.out.println("Compradores cadastrados:");
                    compradores.forEach((chave, valor) -> {
                        System.out.println("Nome: "+valor.getNome());
                        System.out.println("CPF: "+valor.getCpf());
                        System.out.println("Idade: "+valor.getIdade());
                        System.out.println("///////////////////////////");
                    });
                    System.out.println("Pressione qualquer coisa para continuar");
                    input.nextLine(); //limpa buffer
                    pause = input.nextLine();
                    ClearScreen.cls();
                    break;

                case 4:
                    ClearScreen.cls();
                    System.out.println("O total de carros vendidos foi de: "+Comprador.getCarrosComprados());
                    System.out.println("O total arrecadado com as vendas foi de: "+Comprador.getTotalArrecadado());
                    System.out.println("Pressione qualquer coisa para continuar");
                    input.nextLine(); //limpa buffer
                    pause = input.nextLine();
                    ClearScreen.cls();
                    break;
            
                default:
                    break;

            }

        }while(opcao != 0);

        Arquivo.save(compradores); // Salva alteracoes no arquivo

        input.close();
    }
}
