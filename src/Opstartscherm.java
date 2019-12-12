import java.util.Scanner;

public class Opstartscherm {
    public static void main(String[] args) {
        Vragen objectVragen = new Vragen();
        String naamGebruiker;
        int keuze;
        int keuzevak;
        int i = 0;
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Geef je naam: ");
        naamGebruiker = input.nextLine();
        System.out.println("Welkom " + naamGebruiker);
     do {
         System.out.println("Wat wil je gaan doen?");
         System.out.println("\t1.Gegevens invoeren");
         System.out.println("\t2.Test afnemen");
         System.out.println("\t3.Afsluiten");

         do {
             keuze = input.nextInt();
             switch (keuze) {
                 case 1:
                     i++;
                     //Declaratie Invoer
                     String nieuweVraag;
                     String nieuwAntwoord;
                     String Doorgaan;
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
                                 nieuweVraag = input.next();
                                 objectVragen.vragenFrans.add(nieuweVraag);
                                 System.out.println("Geef het antwoord bij deze vraag.");
                                 nieuwAntwoord = input.next();
                                 objectVragen.antwoordenFrans.add(nieuwAntwoord);
                                 System.out.println("Wil je nog een vraag ingeven voor het vak Frans? (J/N)");
                                 Doorgaan = input.next();
                             } while (Doorgaan.equals("J") || Doorgaan.equals("j"));
                             break;
                         case 2:
                             //Programmeren invoeren
                             do {
                                 System.out.println("Geef je nieuwe vraag in voor het vak Programmeren.");
                                 nieuweVraag = input.next();
                                 objectVragen.vragenProgrammeren.add(nieuweVraag);
                                 System.out.println("Geef het antwoord bij deze vraag.");
                                 nieuwAntwoord = input.next();
                                 objectVragen.antwoordenProgrammeren.add(nieuwAntwoord);
                                 System.out.println("Wil je nog een vraag ingeven voor het vak Programmeren? (J/N)");
                                 Doorgaan = input.next();
                             } while (Doorgaan.equals("J") || Doorgaan.equals("j"));
                             break;
                         case 3:
                             //Statistiek Toevoegen
                             do {
                                 System.out.println("Geef je nieuwe vraag in voor het vak Statistiek.");
                                 nieuweVraag = input.next();
                                 objectVragen.vragenStatistiek.add(nieuweVraag);
                                 System.out.println("Geef het antwoord bij deze vraag.");
                                 nieuwAntwoord = input.next();
                                 objectVragen.antwoordenStatistiek.add(nieuwAntwoord);
                                 System.out.println("Wil je nog een vraag ingeven voor het vak Statistiek? (J/N)");
                                 Doorgaan = input.next();
                             } while (Doorgaan.equals("J") || Doorgaan.equals("j"));
                             break;
                         default:
                             //StandaardCase

                             break;
                     }

                     break;
                 case 2:
                     // TEST AFNEMEN
                     i++;
                     System.out.println("Voor welk vak wil je vragen beantwoorden?");
                     System.out.println("\t1.Frans");
                     System.out.println("\t2.Programmeren");
                     System.out.println("\t3.Statistiek");
                     keuzevak = input.nextInt();
                     switch (keuzevak) {
                         case 1:
                             System.out.println("Vraag voor Frans");
                             break;
                         case 2:
                             System.out.println("Vraag voor Programming");
                             break;
                         case 3:
                             System.out.println("Vraag voor Statistiek");
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
                     System.out.println("Ongeldige invoer, het getal kan enkel 1 of 2 zijn.");
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
