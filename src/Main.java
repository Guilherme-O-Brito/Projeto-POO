import br.inatel.Motor.Motor;
import br.inatel.carros.porsche.Porsche718;

public class Main {
    public static void main(String[] args) {
        
        Motor motor = new Motor(6, "boxter", 330, 40, "Gasolina");
        Porsche718 carro = new Porsche718("turbo", "Caramelo", motor, 296, "Traseira", "Branco", 5000000, "Coupe", "Automatico PDK", 2020);

        carro.configurador();
        carro.mostraInfo();

    }
}
