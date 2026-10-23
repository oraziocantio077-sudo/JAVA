public class SensoreTemperatura extends Sensore implements DispositivoAllarmabile {
    private double temperaturaCorrente;

    public SensoreTemperatura (String id, String modello, boolean stato, double temperaturaCorrente) {
        super(id, modello, stato);
        this.temperaturaCorrente = temperaturaCorrente;
    }

    public double getTemperaturaCorrente() {
        return this.temperaturaCorrente;
    }

     @Override
    public void inviaDati() {
        System.out.println("Temperatura Corrente: " + this.temperaturaCorrente);
    }

    @Override
    public void verificaSogliaCritica() {
        if (temperaturaCorrente > 40) {
            System.out.println("Hai superato 40 gradi, soglia critica raggiunta");
        }
        else {
            System.out.println("Temperatura nella norma");
        }
    }
}