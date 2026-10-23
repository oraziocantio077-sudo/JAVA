public class Main {
    public static void main(String [] args) {
        GestoreAmbiente gestore = new GestoreAmbiente();

        SensoreTemperatura st1 = new SensoreTemperatura("12", "Ryzen", true, 20.5);

        SensoreTemperatura st2 = new SensoreTemperatura("13", "Boh", false, 40.5);

        SensoreQualitaAria sqa1 = new SensoreQualitaAria("34", "Bah", true, 2000);

        SensoreQualitaAria sqa2 = new SensoreQualitaAria("45", "ZeroIdee", true, 900);

        gestore.aggiungiSensore(st1);
        gestore.aggiungiSensore(st2);
        gestore.aggiungiSensore(sqa1);
        gestore.aggiungiSensore(sqa2);

        gestore.avviaCensimento();
    }
}