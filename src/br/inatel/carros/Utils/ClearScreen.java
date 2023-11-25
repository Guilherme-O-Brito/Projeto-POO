package br.inatel.carros.Utils;

import java.io.IOException;

public class ClearScreen {
    /**
     * Limpa tela do terminal seja ele executado em windows, linux ou mac
     * @throws IOException
     * @throws InterruptedException
     */
    public static void cls() throws IOException, InterruptedException {

        final String os = System.getProperty("os.name");
        
        if (os.contains("Windows"))
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else
        {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }

    } 
}
