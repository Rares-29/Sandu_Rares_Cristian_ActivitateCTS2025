package hospital;

import java.util.HashMap;
import java.util.Map;

public class FabricaPacienti {

    private Map<Integer, Pacient> pacienti = new HashMap<>();


    public Pacient getPacient(Integer codPacient, String nume, String adresa, String telefon) {
        if (pacienti.containsKey(codPacient)) {
            return pacienti.get(codPacient);
        }
        pacienti.put(codPacient, new Pacient(codPacient, nume, adresa, telefon));
        return pacienti.get(codPacient);
    }
}
