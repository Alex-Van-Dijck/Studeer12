import java.text.DecimalFormat;
import java.util.*;

public class Opstartscherm {
    public static void main(String[] args) {

       //Declaratie
        Vragen objectVragen = new Vragen();
        Random rand = new Random();
        String naamGebruiker;
        int aantalVragenGenereren;
        int keuze;
        int keuzevak;
        int j = 0;
        int n = 0;
        int punten = 0;
        int aantalVragenGesteld = 0;
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
                     keuzevak = input.nextInt();
                     switch (keuzevak) {
                         case 1:
                             //Frans invoeren
                             do {
                                 System.out.println("Geef je nieuwe vraag in voor het vak Frans.");
                                 //Fixen van nextlines
                                 input.nextLine();
                                 nieuweVraag = input.nextLine();
                                 objectVragen.vragenFrans.add(nieuweVraag);
                                 System.out.println("Geef het antwoord bij deze vraag.");
                                 nieuwAntwoord = input.nextLine();
                                 objectVragen.antwoordenFrans.add(nieuwAntwoord);
                                 System.out.println("Wil je nog een vraag ingeven voor het vak Frans? (J/N)");
                                 doorgaan = input.next();
                             } while (doorgaan.equals("J") || doorgaan.equals("j"));
                             break;
                         case 2:
                             //Programmeren invoeren
                             do {
                                 System.out.println("Geef je nieuwe vraag in voor het vak Programmeren.");
                                 input.nextLine();
                                 nieuweVraag = input.nextLine();
                                 objectVragen.vragenProgrammeren.add(nieuweVraag);
                                 System.out.println("Geef het antwoord bij deze vraag.");
                                 nieuwAntwoord = input.nextLine();
                                 objectVragen.antwoordenProgrammeren.add(nieuwAntwoord);
                                 System.out.println("Wil je nog een vraag ingeven voor het vak Programmeren? (J/N)");
                                 doorgaan = input.next();
                             } while (doorgaan.equals("J") || doorgaan.equals("j"));
                             break;
                         case 3:
                             //Statistiek Toevoegen
                            do {
                                System.out.println("Wil je de vragen zelf ingeven of automatisch genereren?");
                                System.out.println("\t1.Zelf ingeven");
                                System.out.println("\t2.Genereren");
                                keuze = input.nextInt();

                                switch (keuze) {
                                    case 1: //Manueel maken
                                        n++;
                                        do {
                                            System.out.println("Geef je nieuwe vraag in voor het vak Statistiek.");
                                            input.nextLine();
                                            nieuweVraag = input.nextLine();
                                            objectVragen.vragenStatistiek.add(nieuweVraag);
                                            System.out.println("Geef het antwoord bij deze vraag.");
                                            nieuwAntwoord = input.nextLine();
                                            objectVragen.antwoordenStatistiek.add(nieuwAntwoord);
                                            System.out.println("Wil je nog een vraag ingeven voor het vak Statistiek? (J/N)");
                                            doorgaan = input.next();
                                        } while (doorgaan.equals("J") || doorgaan.equals("j"));
                                        break;
                                    case 2: //Genereren
                                        n++;
                                        System.out.println("Hoeveel vragen wil je genereren?");
                                        aantalVragenGenereren = input.nextInt();
                                        objectVragen.maakVraag(aantalVragenGenereren);
                                        break;
                                    default:
                                        System.out.println("Ongeldige invoer");
                                }
                            }while(n != 1);
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
                     System.out.println("Voor welk vak wil je vragen beantwoorden?");
                     System.out.println("\t1.Frans");
                     System.out.println("\t2.Programmeren");
                     System.out.println("\t3.Statistiek");
                     keuzevak = input.nextInt();
                     System.out.println("Hoeveel vragen wil je?");
                     aantalVragen = input.nextInt();
                     switch (keuzevak) {
                         case 1:
                             //Vragen Frans

                             for( int k = 0 ; k < aantalVragen ; k++) { //Loop om het aantal vragen af te printen
                                 aantalVragenGesteld += 1;
                                 int random = rand.nextInt(objectVragen.vragenFrans.size());
                                 for (int l = 1; l < 4; l++) { //Loop om de 3 kansen te geven
                                     System.out.println(objectVragen.vragenFrans.get(random));
                                     System.out.println("Poging: "+ l + ": " );
                                     antwoord = input.nextLine();
                                     if (objectVragen.antwoordenFrans.get(random).equals(antwoord)) {
                                         l = 4;
                                         punten += 1;
                                         System.out.println("Correct!");
                                     } else {
                                         System.out.println("Jammer, dat is fout.");
                                         System.out.print("Poging: "+ l + ": " );
                                     }
                                 }
                             }
                             System.out.println("Proficiat " + naamGebruiker + ", je haalde " + punten + "/" + aantalVragenGesteld + "!");

                             break;
                         case 2:
                             //Vragen Programmeren

                             for( int k = 0 ; k < aantalVragen ; k++) { //Loop om het aantal vragen af te printen
                                 aantalVragenGesteld += 1;
                                 int random = rand.nextInt(objectVragen.vragenProgrammeren.size());
                                 for (int l = 1; l < 4; l++) { //Loop om de 3 kansen te geven
                                     System.out.println(objectVragen.vragenProgrammeren.get(random));
                                     System.out.print("Poging: "+ l + ": " );
                                     antwoord = input.next();
                                     if (objectVragen.antwoordenProgrammeren.get(random).equals(antwoord)) {
                                         l = 4;
                                         punten += 1;
                                         System.out.println("Correct!");
                                     } else {
                                         System.out.println("Jammer, dat is fout.");
                                     }
                                 }
                             }
                             System.out.println("Proficiat " + naamGebruiker + ", je haalde " + punten + "/" + aantalVragenGesteld + "!");
                             break;
                         case 3:
                             //Vragen Statistiek
                             for( int k = 0 ; k < aantalVragen ; k++) { //Loop om het aantal vragen af te printen
                                 aantalVragenGesteld += 1;
                                 int random = rand.nextInt(objectVragen.vragenStatistiek.size());
                                 for (int l = 1; l < 4; l++) { //Loop om de 3 kansen te geven
                                     System.out.println(objectVragen.vragenStatistiek.get(random));
                                     System.out.println("(Poging: "+ l +")");
                                     System.out.println("-----------");
                                     antwoord = input.next();
                                     if (objectVragen.antwoordenStatistiek.get(random).equals(antwoord)) {
                                         l = 4;
                                         punten += 1;
                                         System.out.println("Correct!");
                                     } else {
                                         System.out.println("Jammer, dat is fout.");
                                     }
                                 }
                             }
                             System.out.println("Proficiat " + naamGebruiker + ", je haalde " + punten + "/" + aantalVragenGesteld + "!");
                             break;
                         default:
                             System.out.println("Kies een geldige optie.");
                     }
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
             }
         } while (i != 1);
     }while(j != 1);
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
