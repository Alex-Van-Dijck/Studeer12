import java.util.Scanner;

public class Opstartscherm {
    public static void main(String[] args) {
        String naamGebruiker;
        int keuze;
        int keuzevak;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Geef je naam: ");
        naamGebruiker = input.nextLine();
        System.out.println("Welkom " + naamGebruiker);
        System.out.println("Wat wil je gaan doen?");
        System.out.println("\t1.Gegevens invoeren");
        System.out.println("\t2.Test afnemen");

        do{
            keuze = input.nextInt();
            switch (keuze) {
                case 1:
                    i++;
                    // GEGEVENS INVOEREN



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
                default:
                    System.out.println("Ongeldige invoer, het getal kan enkel 1 of 2 zijn.");
                    System.out.println("Wat wil je gaan doen?");
                    System.out.println("\t1.Gegevens invoeren");
                    System.out.println("\t2.Test afnemen");
            }
        }while( i != 1);

    }
}
