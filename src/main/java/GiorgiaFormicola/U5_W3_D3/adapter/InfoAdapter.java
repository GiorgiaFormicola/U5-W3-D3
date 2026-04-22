package GiorgiaFormicola.U5_W3_D3.adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEtà() {
        LocalDate dataDiNascita = info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate oggi = LocalDate.now();
        return Period.between(dataDiNascita, oggi).getYears();
    }
}
