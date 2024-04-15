public class Suo extends Gyvunas {
    private String veisle;

    public Suo(String vardas, String amzius, String svoris, String veisle) {
        super(vardas, amzius, svoris);
        this.veisle = veisle;
    }

    public String getVeisle() {
        return veisle;
    }

    public void setVeisle(String veisle) {
        this.veisle = veisle;
    }
}
