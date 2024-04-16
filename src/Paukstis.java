public class Paukstis extends Gyvunas {
    public String sparnuIlgisMM;

    public Paukstis(String vardas, String amzius, String svoris, String sparnuIlgisMM) {
        super(vardas, amzius, svoris);
        this.sparnuIlgisMM = sparnuIlgisMM;
    }

    public String getSparnuIlgisMM() {
        return sparnuIlgisMM;
    }

    public void setSparnuIlgisMM(String sparnuIlgisMM) {
        this.sparnuIlgisMM = sparnuIlgisMM;
    }


}
