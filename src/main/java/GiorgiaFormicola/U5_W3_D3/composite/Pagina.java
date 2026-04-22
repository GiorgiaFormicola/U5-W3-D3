package GiorgiaFormicola.U5_W3_D3.composite;

public class Pagina implements Component {
    @Override
    public int getPages() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println("Pagina");
    }
}
