package GiorgiaFormicola.U5_W3_D3.runners;

import GiorgiaFormicola.U5_W3_D3.composite.Libro;
import GiorgiaFormicola.U5_W3_D3.composite.Pagina;
import GiorgiaFormicola.U5_W3_D3.composite.Sezione;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n------------- INIZIO ESERCIZIO COMPOSITE -------------\n");
        List<String> autori = new ArrayList<>(List.of("Aldo", "Giovanni", "Giacomo"));
        Libro libro = new Libro(autori, 20);

        Sezione sezione3pag = new Sezione();
        sezione3pag.add(new Pagina());
        sezione3pag.add(new Pagina());
        sezione3pag.add(new Pagina());

        Sezione sezione4pag = new Sezione();
        sezione4pag.add(new Pagina());
        sezione4pag.add(sezione3pag);

        Sezione sezione6pag = new Sezione();
        sezione6pag.add(new Pagina());
        sezione6pag.add(new Pagina());
        sezione6pag.add(new Pagina());
        sezione6pag.add(new Pagina());
        sezione6pag.add(new Pagina());
        sezione6pag.add(new Pagina());

        libro.add(new Pagina());
        libro.add(new Pagina());
        libro.add(new Pagina());
        libro.add(sezione6pag);
        libro.add(sezione4pag);

        libro.print();
    }
}
