package GiorgiaFormicola.U5_W3_D3.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component child) {
        this.children.add(child);
    }

    @Override
    public int getPages() {
        return children.stream().mapToInt(child -> getPages()).sum();
    }

    @Override
    public void print() {
        System.out.println("SEZIONE");
        children.stream().forEach(child -> child.print());
    }
}
