package GiorgiaFormicola.U5_W3_D3.chainOfResponsibility;

public class Generale extends Ufficiale {
    public Generale() {
        super();
        this.setStipendio(5000);
    }

    @Override
    public void riconoscimento() {
        System.out.println("Sono il Generale! Il mio stipendio è di " + getStipendio() + " e non ho responsabili.");
    }
}
