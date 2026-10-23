public class SensoreQualitaAria extends Sensore implements DispositivoAllarmabile{
    private int livelloCO2;

    public SensoreQualitaAria (String id, String modello, boolean stato, int livelloCO2) {
        super(id, modello, stato);
        this.livelloCO2 = livelloCO2;
    }

    public int getLivelloCO2() {
        return this.livelloCO2;
    }

    @Override
    public void inviaDati() {
        System.out.println("Livello CO2: " + this.livelloCO2);
    }

    @Override
    public void verificaSogliaCritica() {
        if (livelloCO2 > 1000) {
            System.out.println("Soglia critica");
        }
        else {
            System.out.println("Livello di CO2 nella norma");
        }
    }

}