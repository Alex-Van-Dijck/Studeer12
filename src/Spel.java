import java.text.DecimalFormat;
import java.util.*;

public class Spel {
    public static void main(String[] args) {

        //Declaratie
        Vragen objectVragen = new Vragen();
        VraagSelector objectVraagSelector = new VraagSelector();
        Random rand = new Random();
        String naamGebruiker;
        String keuzeDoorgaan;
        int keuzeVakVraag;
        int aantalVragenGenereren;
        int keuze;
        int keuzevak;
        int j = 0;
        Scanner input = new Scanner(System.in);

        //Welkomstmenu
        System.out.print("Geef je naam: ");
        naamGebruiker = input.nextLine();
        System.out.println("Welkom " + naamGebruiker);
        do {
            System.out.println("Wat wil je gaan doen?");
            System.out.println("\t1.Gegevens invoeren");
            System.out.println("\t2.Test afnemen");
            System.out.println("\t3.Afsluiten");
            int i = 0;
            do {
                keuze = input.nextInt();
                input.nextLine();
                switch (keuze) {
                    case 1:
                        i++;
                        //Declaratie Invoer
                        String nieuweVraag;
                        String nieuwAntwoord;
                        String doorgaan;
                        // GEGEVENS INVOEREN
                        System.out.println("Voor welk vak wens je gegevens in te geven?");
                        System.out.println("\t1.Frans");
                        System.out.println("\t2.Programmeren");
                        System.out.println("\t3.Statistiek");
                        System.out.println("\t4.Terug");
                        keuzevak = input.nextInt();
                        switch (keuzevak) {
                            case 1:
                                //Frans invoeren
                                objectVragen.maakVraagFrans();
                                break;
                            case 2:
                                //Programmeren invoeren

                                objectVragen.maakVraagProgrammeren();
                                break;
                            case 3:
                                //Statistiek Toevoegen
                                objectVragen.maakVraagStatistiek();
                                break;
                            case 4:
                                //Doet niets, springt gewoon terug naar menu
                                break;
                            default:
                                //StandaardCase
                                break;
                        }

                        break;
                    case 2:
                        // TEST AFNEMEN
                        i++;
                        int aantalVragen;
                        String antwoord;
                        boolean doorgaan2 = true;
                        int k = 0;
                        do {
                            System.out.println("Voor welk vak wil je vragen beantwoorden?");
                            System.out.println("\t1.Frans");
                            System.out.println("\t2.Programmeren");
                            System.out.println("\t3.Statistiek");
                            System.out.println("\t4.Terug");
                            keuzeVakVraag = input.nextInt();
                            input.nextLine();
                            System.out.println("Hoeveel vragen wil je?");
                            aantalVragen = input.nextInt();
                            input.nextLine();
                            objectVraagSelector.addVragen(aantalVragen, keuzeVakVraag, objectVragen);
                            System.out.println("Wil je nog vragen van een extra vak toevoegen? (J/N)");

                            keuzeDoorgaan = input.next();
                            input.nextLine();
                        } while (keuzeDoorgaan.equals("J") || keuzeDoorgaan.equals("j"));
                        objectVraagSelector.stelVragen(naamGebruiker);
                        break;
                    case 3:
                        //Afsluiten
                        j++;
                        i++;
                        break;
                        default:
                        System.out.println("Ongeldige invoer, het getal kan enkel 1, 2 of 3 zijn.");
                        System.out.println("Wat wil je gaan doen?");
                        System.out.println("\t1.Gegevens invoeren");
                        System.out.println("\t2.Test afnemen");
                        System.out.println("\t3.Afsluiten");
                        break;
                }
            } while (i != 1);
        } while (j != 1);
        System.out.println("Frans");
        System.out.println(objectVragen.vragenFrans);
        System.out.println(objectVragen.antwoordenFrans);
        System.out.println("Programmeren");
        System.out.println(objectVragen.vragenProgrammeren);
        System.out.println(objectVragen.antwoordenProgrammeren);
        System.out.println("Statistiek");
        System.out.println(objectVragen.vragenStatistiek);
        System.out.println(objectVragen.antwoordenStatistiek);
    }
}
