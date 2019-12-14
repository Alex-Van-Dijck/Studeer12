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
    public void maakMaximumvraag() {

        int random1 = rand.nextInt(100) + 1;
        int random2 = rand.nextInt(100) + 1;
        int hoogste = Math.max(random1, random2);
        vragenStatistiek.add("Welk getal is hoger? " + random1 + " of " + random2 + "?" );
        antwoordenStatistiek.add(Integer.toString(hoogste));
    }








}
