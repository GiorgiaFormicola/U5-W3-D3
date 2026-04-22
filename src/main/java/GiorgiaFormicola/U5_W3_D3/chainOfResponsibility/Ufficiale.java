package GiorgiaFormicola.U5_W3_D3.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Ufficiale {
    private int stipendio;
    private Ufficiale responsabile;

    public Ufficiale() {
    }

    public abstract void riconoscimento();

    /*public void checkStipendio(int importo) {
        this.riconoscimento();
        if (importo <= this.getStipendio())
            System.out.println("Sono il primo ufficiale della gerarchia che percepisce almeno " + importo + " euro.");
        else this.next(importo);
    }*/;

    /*public void next(int importo) {
        if (responsabile != null) responsabile.checkStipendio(importo);
        else System.out.println("Nessun ufficiale percepisce almeno " + importo + " euro.");
    }*/
}
