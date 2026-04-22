package GiorgiaFormicola.U5_W3_D3.chainOfResponsibility;

public class Colonnello extends Ufficiale {
    public Colonnello(Ufficiale responsabile) {
        super();
        this.setStipendio(4000);
        this.setResponsabile(responsabile);
    }

    @Override
    public void riconoscimento() {
        System.out.println("Sono il Colonnello! Il mio stipendio è di " + getStipendio() + " ed il mio responsabile è il " + getResponsabile().getClass().getSimpleName() + ".");
    }
}
