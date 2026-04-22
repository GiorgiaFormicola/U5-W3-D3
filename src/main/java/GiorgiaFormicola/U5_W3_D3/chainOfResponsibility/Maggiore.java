package GiorgiaFormicola.U5_W3_D3.chainOfResponsibility;

public class Maggiore extends Ufficiale {
    public Maggiore(Ufficiale responsabile) {
        super();
        this.setStipendio(3000);
        this.setResponsabile(responsabile);
    }

    @Override
    public void riconoscimento() {
        System.out.println("Sono il Maggiore! Il mio stipendio è di " + getStipendio() + " ed il mio responsabile è il " + getResponsabile().getClass().getSimpleName() + ".");
    }
}
