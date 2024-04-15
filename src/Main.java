//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Prieglauda prieglauda = new Prieglauda();
        Gyvunas suo = new Suo("Brisius", "7", "15", "Vokieciu aviganis");
        Gyvunas suo1 = new Suo("Brisius1", "5", "12", "Kolis");
        Gyvunas kate = new Kate("Pukis", "7", "5", "Raudona");
        Gyvunas kate1 = new Kate("Pukis1", "5", "8", "Balta");
        Gyvunas paukstis = new Paukstis("Micius", "3", "1", "65");
        Gyvunas paukstis1 = new Paukstis("Micius1", "4", "1.5", "60");
        prieglauda.sarasas.add(suo);
        prieglauda.sarasas.add(suo1);
        prieglauda.sarasas.add(kate);
        prieglauda.sarasas.add(kate1);
        prieglauda.sarasas.add(paukstis);
        prieglauda.sarasas.add(paukstis1);

        prieglauda.valdymas();


        }
    }
