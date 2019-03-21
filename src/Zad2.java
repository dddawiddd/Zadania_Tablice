import java.util.Arrays;
import java.util.Random;

public class Zad2 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] wyniki = new int[10];
        int numer = 0;
        do {
            wyniki[numer] = random.nextInt(41) - 20;
            numer++;
        } while (numer < 10);

        System.out.print("\nTablica 10 liczb Od [-20 do 20]:  ");
        for (int asd : wyniki) {
            System.out.print(asd + ", ");
        }


        System.out.println("\n_________A");
        Arrays.sort(wyniki);
        System.out.println("Najmniejszy element tablicy: " + wyniki[0]);
        System.out.println("Najwiekszy element tablicy: " + wyniki[wyniki.length - 1]);


        System.out.println("\n_________B");
        int suma = 0;
        for (int asd : wyniki) {
            suma += asd;
        }
        double srednia = (double) suma / wyniki.length;
        System.out.println("Srednia arytmetyczna: " + srednia);


        System.out.println("\n_________C");
        int zliczacz = 0;
        for (int asd : wyniki) {

            if (asd < srednia) {
                zliczacz++;
            }
        }
        System.out.println("Jest " + zliczacz + " elementów mniejszych i " + (wyniki.length - zliczacz) + " większych od średniej arytmetycznej");


        System.out.println("\n_________D");
        int[] licznik = new int[41];

/*        for (int asd : licznik) {  //todo to chyba nie potrzebne bo i tak wszedzie wartość poczatkowa integera wynosi 0?
            asd = 0;
        }*/

        for (int i = 0; i < wyniki.length; i++) {
            int fff = wyniki[i] + 20;
            licznik[fff]++;
        }

        for (int j = 0; j < licznik.length; j++) {
            if (licznik[j] != 0) {
                System.out.println((j - 20) + " : " + licznik[j]);
            }
        }
    }
}