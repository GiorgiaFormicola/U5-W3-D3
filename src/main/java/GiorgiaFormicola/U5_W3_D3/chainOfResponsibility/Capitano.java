package GiorgiaFormicola.U5_W3_D3.chainOfResponsibility;

public class Capitano extends Ufficiale {
    public Capitano(Ufficiale responsabile) {
        super();
        this.setStipendio(2000);
        this.setResponsabile(responsabile);
    }

    @Override
    public void riconoscimento() {
        System.out.println("Sono il Capitano! Il mio stipendio è di " + getStipendio() + " ed il mio responsabile è il " + getResponsabile().getClass().getSimpleName() + ".");
    }
}
