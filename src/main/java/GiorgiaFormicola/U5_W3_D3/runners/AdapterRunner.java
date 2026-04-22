package GiorgiaFormicola.U5_W3_D3.runners;

import GiorgiaFormicola.U5_W3_D3.adapter.Info;
import GiorgiaFormicola.U5_W3_D3.adapter.InfoAdapter;
import GiorgiaFormicola.U5_W3_D3.adapter.UserData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n------------- INIZIO ESERCIZIO ADAPTER -------------");

        UserData userData = new UserData();

        Info userInfo = new Info();
        userInfo.setNome("Mario");
        userInfo.setCognome("Rossi");
        userInfo.setDataDiNascita(new SimpleDateFormat("dd/MM/yyyy").parse("12/08/1997"));

        System.out.println("\n>>>>> USER INFO");
        System.out.println("NOME: " + userInfo.getNome());
        System.out.println("COGNOME: " + userInfo.getCognome());
        System.out.println("DATA DI NASCITA: " + userInfo.getDataDiNascita());

        InfoAdapter userAdaptedInfo = new InfoAdapter(userInfo);

        System.out.println("\n>>>>> USER INFO CONVERTITE A DATA SOURCE");
        System.out.println("NOME COMPLETO: " + userAdaptedInfo.getNomeCompleto());
        System.out.println("ETA': " + userAdaptedInfo.getEtà());

        userData.getData(userAdaptedInfo);

        System.out.println("\n------------- FINE ESERCIZIO ADAPTER -------------");
    }
}
