import java.text.DecimalFormat;
import java.util.*;

public class Spel {
    public static void main(String[] args) {
        //Miguel Reyntjens & Alex Van Dijck
        try {
            //Declaratie
            Vragen objectVragen = new Vragen();
            VraagSelector objectVraagSelector = new VraagSelector();
            Random rand = new Random();
            String naamGebruiker = "";
            String keuzeDoorgaan = "";
            int keuzeVakVraag;
            int keuze = 0;
            int keuzevak = 0;
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
                            // GEGEVENS INVOEREN
                            System.out.println("Voor welk vak wens je gegevens in te geven?");
                            System.out.println("\t1.Frans");
                            System.out.println("\t2.Programmeren");
                            System.out.println("\t3.Statistiek");

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
                                default:
                                    //StandaardCase
                                    break;
                            }

                            break;
                        case 2:
                            // TEST AFNEMEN
                            i++;
                            int aantalVragen;
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
                            i++;
                            j++;
                            break;
                    }
                } while (i != 1);
            } while (j != 1);
        } catch (InputMismatchException ex) {
            System.out.println("Foutieve invoer");
        }
    }
}
