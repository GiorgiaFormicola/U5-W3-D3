package GiorgiaFormicola.U5_W3_D3.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ComponenteLibro {
    private List<ComponenteLibro> componenteLibro = new ArrayList<>();

    public void add(ComponenteLibro componente) {
        this.componenteLibro.add(componente);
    }

    @Override
    public int getPages() {
        return componenteLibro.stream().mapToInt(componente -> componente.getPages()).sum();
    }

    @Override
    public void print() {
        if (this.getPages() == 1) System.out.println("SEZIONE (" + getPages() + " pagina)");
        else System.out.println("SEZIONE (" + getPages() + " pagine)");
        componenteLibro.stream().forEach(componente -> componente.print());
    }
}
