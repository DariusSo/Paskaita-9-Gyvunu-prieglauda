import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prieglauda {
    Scanner scanner = new Scanner(System.in);
    List<Gyvunas> sarasas = new ArrayList<>();

    public void valdymas(){
        System.out.println("Noresite prideti(1), pasalinti(2) gyvunus is saraso, pamatyti turimus gyvunus(3), surasti informacija apie konkrecius gyvunus(4)?");
        int a = scanner.nextInt();
        scanner.nextLine();
        switch(a){
            case 1:
                prideti();
                while (true){
                    System.out.println("Spauskite 1 jeigu norite prideti dar, 2 jeigu norite baigti.");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    if (b == 1){
                        prideti();
                    }else{
                        System.exit(0);
                    }
                break;
                }
            case 2:
                pasalinti();
                while (true){
                    System.out.println("Spauskite 1 jeigu norite pasalinti dar, 2 jeigu norite baigti.");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    if (c == 1){
                        prideti();
                    }else{
                        System.exit(0);
                    }
                    break;
                }
            case 3:
                rodykSarasa();
                valdymas();
                break;
            case 4:
                System.out.println("Iveskite varda/amziu/svori/klase: ");
                String z = scanner.nextLine();
                gyvunoPaieska(z);
                valdymas();
                break;
        }

    }
    public void prideti(){
        System.out.println("Koki gyvuna noresite prideti? Suo(1), Kate(2), Paukstis(3)");
        int gyv = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Koks vardas?");
        String vardas = scanner.nextLine();
        System.out.println("Koks amzius?");
        String amzius = scanner.nextLine();
        System.out.println("Koks svoris?");
        String svoris = scanner.nextLine();
        switch (gyv){
            case 1:
                System.out.println("Kokia veisle?");
                String veisle = scanner.nextLine();
                Suo suo = new Suo(vardas, amzius, svoris, veisle);
                sarasas.add(suo);
                System.out.println("Pridetas gyvunas yra: " + suoInfo(suo));
                break;
            case 2:
                System.out.println("Kokia kailio spalva?");
                String kailioSpalva = scanner.nextLine();
                Kate kate = new Kate(vardas, amzius, svoris,kailioSpalva);
                sarasas.add(kate);
                System.out.println("Pridetas gyvunas yra: " + kateInfo(kate));
                break;
            case 3:
                System.out.println("Koks sparnu ilgis?");
                String sparnuIlgis = scanner.nextLine();
                scanner.nextLine();
                Paukstis paukstis = new Paukstis(vardas, amzius, svoris, sparnuIlgis);
                sarasas.add(paukstis);
                System.out.println("Pridetas gyvunas yra: " + paukscioInfo(paukstis));
                break;
            default:
                System.out.println("Kazka blogai ivedete.");
        }
    }
    public void pasalinti(){
        System.out.println("Koki gyvuna noresite pasalinti? Iveskite varda:");
        String vardas = scanner.nextLine();
        for (Gyvunas g : sarasas){
            if (g.getVardas().equals(vardas)){

                sarasas.remove(g);
                System.out.println("Pasalintas gyvunas: " + gyvunoInfo(g));
                break;
            }
        }
    }
    public void gyvunoPaieska(String gKintamasis){
        for (Gyvunas g : sarasas){
            if (g.getVardas().equals(gKintamasis) || g.getAmzius().equals(gKintamasis) || g.getSvoris().equals(gKintamasis) || String.valueOf(getClass()).equals(gKintamasis)){
                if (g.getClass().getSimpleName().equals("Suo")){
                    System.out.println(suoInfo((Suo) g));
                } else if (g.getClass().getSimpleName().equals("Kate")) {
                    System.out.println(kateInfo((Kate) g));
                } else if (g.getClass().getSimpleName().equals("Paukstis")) {
                    System.out.println(paukscioInfo((Paukstis) g));
                }

            }
        }

    }
    public String gyvunoInfo(Gyvunas g){
        if (g.getClass().getSimpleName().equals("Suo")){
            return suoInfo((Suo) g);
        } else if (g.getClass().getSimpleName().equals("Kate")) {
            return kateInfo((Kate) g);
        } else if (g.getClass().getSimpleName().equals("Paukstis")) {
            return paukscioInfo((Paukstis) g);
        }
        return "";
    }
    public String paukscioInfo(Paukstis a){
        return "Vardas: " + a.getVardas() + ", amzius: " + a.getAmzius() + ", svoris: " + a.getSvoris() + ", klase: " + a.getClass().getSimpleName() + ", sparnu ilgis (mm):" + a.getSparnuIlgisMM();
    }
    public String suoInfo(Suo a){
        return "Vardas: " + a.getVardas() + ", amzius: " + a.getAmzius() + ", svoris: " + a.getSvoris() + ", klase: " + a.getClass().getSimpleName() + ", veisle: " + a.getVeisle();
    }
    public String kateInfo(Kate a){
        return "Vardas: " + a.getVardas() + ", amzius: " + a.getAmzius() + ", svoris: " + a.getSvoris() + ", klase: " + a.getClass().getSimpleName() + ", kailio spalva: " + a.getKailioSpalva();
    }
    public void rodykSarasa(){
        for (Gyvunas g : sarasas){
            if (g.getClass().getSimpleName().equals("Suo")){
                System.out.println(suoInfo((Suo) g));
            } else if (g.getClass().getSimpleName().equals("Kate")) {
                System.out.println(kateInfo((Kate) g));
            } else if (g.getClass().getSimpleName().equals("Paukstis")) {
                System.out.println(paukscioInfo((Paukstis) g));
            }
        }
    }

}
