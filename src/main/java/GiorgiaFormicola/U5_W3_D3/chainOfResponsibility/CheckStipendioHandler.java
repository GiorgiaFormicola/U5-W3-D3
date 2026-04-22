package GiorgiaFormicola.U5_W3_D3.chainOfResponsibility;

public class CheckStipendioHandler {
    public static void checkStipendio(int importo, Ufficiale ufficiale) {
        ufficiale.riconoscimento();
        if (importo <= ufficiale.getStipendio())
            System.out.println("Sono il primo ufficiale della gerarchia che percepisce almeno " + importo + " euro.");
        else next(importo, ufficiale.getResponsabile());
    }

    public static void next(int importo, Ufficiale responsabile) {
        if (responsabile != null) checkStipendio(importo, responsabile);
        else System.out.println("Nessun ufficiale percepisce almeno " + importo + " euro.");
    }
}
