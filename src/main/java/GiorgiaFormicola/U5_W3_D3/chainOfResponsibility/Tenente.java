package GiorgiaFormicola.U5_W3_D3.chainOfResponsibility;

public class Tenente extends Ufficiale {
    public Tenente(Ufficiale responsabile) {
        super();
        this.setStipendio(1000);
        this.setResponsabile(responsabile);
    }

    @Override
    public void riconoscimento() {
        System.out.println("Sono il Tenente! Il mio stipendio è di " + getStipendio() + " ed il mio responsabile è il " + getResponsabile().getClass().getSimpleName());
    }
}
