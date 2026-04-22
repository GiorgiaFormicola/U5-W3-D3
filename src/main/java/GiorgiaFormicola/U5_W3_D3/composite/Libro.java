package GiorgiaFormicola.U5_W3_D3.composite;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Component {
    private List<Component> children = new ArrayList<>();
    private List<String> autori;
    private double price;

    public Libro(List<String> autori, double price) {
        this.autori = autori;
        this.price = price;
    }

    public void add(Component child) {
        this.children.add(child);
    }

    @Override
    public int getPages() {
        return children.stream().mapToInt(child -> child.getPages()).sum();
    }

    @Override
    public void print() {
        System.out.println("LIBRO");
        children.stream().forEach(child -> child.print());
    }
}
