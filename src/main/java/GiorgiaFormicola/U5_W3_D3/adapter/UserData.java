package GiorgiaFormicola.U5_W3_D3.adapter;

public class UserData {
    private String nomeCompleto;
    private int età;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        età = ds.getEtà();
    }
}
