package GiorgiaFormicola.U5_W3_D3.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Libro {
    private List<ComponenteLibro> componentiLibro = new ArrayList<>();
    private List<String> autori;
    private double price;

    public Libro(List<String> autori, double price) {
        this.autori = autori;
        this.price = price;
    }

    public void add(ComponenteLibro componente) {
        this.componentiLibro.add(componente);
    }

    public int getPages() {
        return componentiLibro.stream().mapToInt(componente -> componente.getPages()).sum();
    }

    public void print() {
        if (this.getPages() == 1) System.out.println("LIBRO (" + getPages() + " pagina)");
        else System.out.println("LIBRO (" + getPages() + " pagine)");
        System.out.println("Autori: " + String.join(", ", getAutori()));
        System.out.println("Prezzo: $" + getPrice());
        System.out.println("");
        componentiLibro.stream().forEach(componente -> componente.print());
    }
}
