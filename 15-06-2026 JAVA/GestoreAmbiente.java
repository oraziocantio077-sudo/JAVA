import java.util.ArrayList;

public class GestoreAmbiente {
    private ArrayList<Sensore> sensori;

    public GestoreAmbiente() {
        this.sensori = new ArrayList<>();
    }

    public void aggiungiSensore(Sensore s) {
        sensori.add(s);
    }

    public void avviaCensimento() {
        for (Sensore s : sensori) {
            s.inviaDati();
            if (s instanceof DispositivoAllarmabile) {
                // Facciamo il cast per poter chiamare il metodo dell'interfaccia
                ((DispositivoAllarmabile) s).verificaSogliaCritica();
            }
        }
    }
}