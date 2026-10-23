public abstract class Sensore {
    private String id;
    private String modello;
    private boolean stato;

    public Sensore(String id, String modello, boolean stato) {
        this.id = id;
        this.modello = modello;
        this.stato = stato;
    }

    public String getID() {
        return this.id;
    }

    public String getModello() {
        return this.modello;
    }

    public boolean getStato() {
        return this.stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public abstract void inviaDati();

}