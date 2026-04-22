package GiorgiaFormicola.U5_W3_D3.runners;

import GiorgiaFormicola.U5_W3_D3.composite.Libro;
import GiorgiaFormicola.U5_W3_D3.composite.Pagina;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n------------- INIZIO ESERCIZIO COMPOSITE -------------");
        List<String> autori = new ArrayList<>(List.of("Aldo", "Giovanni", "Giacomo"));
        Libro libro = new Libro(autori, 20);
        libro.print();
        System.out.println(libro.getPages());

        libro.add(new Pagina());
        libro.add(new Pagina());
        libro.add(new Pagina());

        libro.print();
        System.out.println(libro.getPages());


        System.out.println("\n------------- FINE ESERCIZIO COMPOSITE -------------");
    }
}
