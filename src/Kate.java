public class Kate extends Gyvunas {
    private String kailioSpalva;

    public Kate(String vardas, String amzius, String svoris, String kailioSpalva) {
        super(vardas, amzius, svoris);
        this.kailioSpalva = kailioSpalva;
    }

    public String getKailioSpalva() {
        return kailioSpalva;
    }

    public void setKailioSpalva(String kailioSpalva) {
        this.kailioSpalva = kailioSpalva;
    }
}
