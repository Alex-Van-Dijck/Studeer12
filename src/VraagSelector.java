import java.util.*;

public class VraagSelector {

    private List<String> vragenTemp = new ArrayList<>();
    private List<String> antwoordenTemp = new ArrayList<>();
    private Spel objectSpel = new Spel();
    private Scanner input = new Scanner(System.in);
    private Random rand = new Random();
    int aantalVragenGesteld = 0;
    int punten = 0;
    String antwoord;

    public void addVragen(int hoeveelheid, int vak, Vragen objectVragen){

        switch(vak){
            case 1:
                for(int m = 0; m < hoeveelheid; m++){
                    int random = rand.nextInt(objectVragen.vragenFrans.size());
                    vragenTemp.add(objectVragen.vragenFrans.get(random));
                    antwoordenTemp.add(objectVragen.antwoordenFrans.get(random));
                }
            break;
            case 2:
                for(int m = 0; m < hoeveelheid; m++){
                int random = rand.nextInt(objectVragen.vragenProgrammeren.size());
                vragenTemp.add(objectVragen.vragenProgrammeren.get(random));
                antwoordenTemp.add(objectVragen.antwoordenProgrammeren.get(random));
            }
            break;
            case 3:
                for(int m = 0; m < hoeveelheid; m++){
                int size = objectVragen.vragenStatistiek.size();
                int random = rand.nextInt(size);
                vragenTemp.add(objectVragen.vragenStatistiek.get(random));
                antwoordenTemp.add(objectVragen.antwoordenStatistiek.get(random));
            }
            break;
            default:
                System.out.println("Ongeldig vak");
        }

    }

    public void stelVragen(String naamGebruiker){
        for (int k = 0; k < vragenTemp.size(); k++) { //Loop om het aantal vragen af te printen
            aantalVragenGesteld += 1;
            int random = rand.nextInt(vragenTemp.size());
            for (int l = 1; l < 4; l++) { //Loop om de 3 kansen te geven
                if (aantalVragenGesteld != 1) {
                    System.out.println("Je tijdelijke score is " + punten + "/" + vragenTemp.size());
                    System.out.println("--------------------------------------");
                }
                System.out.println("Vraag " + aantalVragenGesteld + " (Poging: " + l + ")");
                System.out.println("--------------------------------------");
                System.out.println("Vraag: " + vragenTemp.get(random));
                System.out.print("Antwoord: ");
                antwoord = input.nextLine();
                if (antwoordenTemp.get(random).equals(antwoord)) {
                    l = 4;
                    punten += 1;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Jammer, dat is fout.");
                }
            }
        }
        System.out.println("Proficiat " + naamGebruiker + ", je haalde " + punten + "/" + aantalVragenGesteld + "!");
        aantalVragenGesteld = 0;
        punten = 0;
    }

}
