import java.text.DecimalFormat;
import java.util.*;

public class Vragen {
    Random rand = new Random();
    List<String> vragenFrans = new ArrayList<>();
    List<String> vragenStatistiek = new ArrayList<>();
    List<String> vragenProgrammeren = new ArrayList<>();
    List<String> antwoordenFrans = new ArrayList<>();
    List<String> antwoordenStatistiek = new ArrayList<>();
    List<String> antwoordenProgrammeren = new ArrayList<>();

    //Automatische vragen
        //Automatische Maximumvraag
    private void maakMaximumvraag3() {

        int random1 = rand.nextInt(100) + 1;
        int random2 = rand.nextInt(100) + 1;
        int random3 = rand.nextInt(100) + 1;
        int hoogste = Math.max(random1, Math.max(random2, random3));
        vragenStatistiek.add("Welk getal is hoger? " + random1 + ", " + random2 +  " of " + random3 + "?" );
        antwoordenStatistiek.add(Integer.toString(hoogste));
    }
    private void maakMaximumvraag2() {

        int random1 = rand.nextInt(100) + 1;
        int random2 = rand.nextInt(100) + 1;
        int hoogste = Math.max(random1, random2);
        vragenStatistiek.add("Welk getal is hoger? " + random1 + " of " + random2 + "?" );
        antwoordenStatistiek.add(Integer.toString(hoogste));
    }
        //Automatische gemiddeldevraag
        private void maakGemiddeldevraag3(){
        int random1 = rand.nextInt(100) + 1;
        int random2 = rand.nextInt(100) + 1;
        int random3 = rand.nextInt(100) + 1;
        double gemiddelde = ((double)(random1 + random2 + random3)/3)*100;
        int rondaf = (int) Math.round(gemiddelde);
        double toon = rondaf * 0.01;
        // NUL NA DE KOMMA WEGWERKEN
        String toon2 = Double.toString(toon);
        String toon3 = toon2.replaceAll("()\\.0+$|(\\..+?)0+$", "$2");
        // TOT HIER
        vragenStatistiek.add("Wat is het gemiddelde van " + random1 + ", " + random2 + " en "  + random3 + "? (Afronden op 2 getallen na de komma)." );
            antwoordenStatistiek.add(toon3);

    }
    private void maakGemiddeldevraag2(){
        int random1 = rand.nextInt(100) + 1;
        int random2 = rand.nextInt(100) + 1;
        double gemiddelde = ((double)(random1 + random2)/2)*100;
        int rondaf = (int) Math.round(gemiddelde);
        double toon = rondaf * 0.01;
        // NUL NA DE KOMMA WEGWERKEN
        String toon2 = Double.toString(toon);
        String toon3 = toon2.replaceAll("()\\.0+$|(\\..+?)0+$", "$2");
        // TOT HIER
        vragenStatistiek.add("Wat is het gemiddelde van " + random1 + " en " + random2 + "? (Afronden op 2 getallen na de komma)." );
        antwoordenStatistiek.add(toon3);
    }
    //Random vraag selector
    public void maakVraag(int aantalVragen) {
        for (int m = 0; m < aantalVragen; m++) {
            int random = rand.nextInt(4) + 1;

            switch (random) {
                case 1:
                    maakGemiddeldevraag2();
                    break;
                case 2:
                    maakGemiddeldevraag3();
                    break;
                case 3:
                    maakMaximumvraag2();
                    break;
                case 4:
                    maakMaximumvraag3();
                    break;
            }
        }
    }








}
