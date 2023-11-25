import br.inatel.Motor.Motor;
import br.inatel.carros.porsche.Porsche718;
import br.inatel.carros.porsche.Porsche911;

public class Main {
    public static void main(String[] args) {
        
        Motor motor = new Motor(6, "boxter", 440, 100, "Gasolina");
        Porsche911 carro = new Porsche911("GT3 RS", "Preto", motor, 302, "Traseira", "Vermelho", 4300000, "Coupe", "Automatico PDK", 2022);

        carro.configurador();
        carro.mostraInfo();

    }
}
