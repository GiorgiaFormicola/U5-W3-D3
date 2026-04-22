package GiorgiaFormicola.U5_W3_D3.runners;

import GiorgiaFormicola.U5_W3_D3.chainOfResponsibility.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainOfResponsibilityRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n------------- INIZIO ESERCIZIO CHAIN OF RESPONSIBILITY -------------");
        Generale generale = new Generale();
        Colonnello colonnello = new Colonnello(generale);
        Maggiore maggiore = new Maggiore(colonnello);
        Capitano capitano = new Capitano(maggiore);
        Tenente tenente = new Tenente(capitano);


        /*CheckStipendioHandler.checkStipendio(6000, tenente);*/

        tenente.checkStipendio(1050);


        System.out.println("\n------------- FINE ESERCIZIO CHAIN OF RESPONSIBILITY -------------");
    }
}
