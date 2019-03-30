import java.util.Scanner;

public class Zad6 {

    public static void main(String[] args) {

        String[][] kolkokrzyzyk = new String[4][4];                         //[wiersze][kolumny]

        for (int k = 0; k < kolkokrzyzyk.length; k++) {                      //nadpisywanie
            for (int l = 0; l < kolkokrzyzyk[0].length; l++) {
                kolkokrzyzyk[k][l] = " ";
            }
        }

        System.out.println("GRA KOLKO KRZYRZYK\n");

        while (true) {

            wprowadzanie(kolkokrzyzyk, "O", "KOLKO");

            drukowanie(kolkokrzyzyk);                                                    //drukowanie O

            if (spradzanieWygranej(kolkokrzyzyk, "O", "KOLKO")) {                //sprawdzanie O
                break;
            }


            wprowadzanie(kolkokrzyzyk, "X", "KRZYZYK");

            drukowanie(kolkokrzyzyk);                                                    //drukowanie X

            if (spradzanieWygranej(kolkokrzyzyk, "X", "KRZYZYK")) {                //sprawdzanie X
                break;
            }
        }
    }


    private static void wprowadzanie(String[][] kolkokrzyzyk, String ox, String who) {

        Scanner scaner = new Scanner(System.in);
        int wiersz, kolumna;

        System.out.println("Gracz: " + who);

        while (true) {
            System.out.print("Wprowadz wiersz [1-" + kolkokrzyzyk.length + "]: ");
            //wiersz = Integer.parseInt(scaner.nextLine())-1;
            wiersz = scaner.nextInt() - 1;
            System.out.print("Wprowadz kolumne [1-" + kolkokrzyzyk[0].length + "]: ");
            kolumna = scaner.nextInt() - 1;


            if (wiersz < kolkokrzyzyk.length && wiersz >= 0 && kolumna < kolkokrzyzyk[0].length && kolumna >= 0) {
                if (kolkokrzyzyk[wiersz][kolumna].equals(" ")) {
                    kolkokrzyzyk[wiersz][kolumna] = ox;
                    break;
                }
                System.out.println("To pole jest zajete. " + who + " wprowadz jeszcze raz inne pole");
            } else
                System.out.println("Nie ma takiego pola. Podaj jeszcze raz.");
        }
    }


    public static void drukowanie(String[][] kolkokrzyzyk) {

        for (String[] strings : kolkokrzyzyk) {                      //drukowanie  todo pzrobić z drukowania metode
            for (int j = 0; j < kolkokrzyzyk[0].length; j++) {
                System.out.print("|" + strings[j] + "|");
            }
            System.out.println("");
        }
    }


    public static boolean spradzanieWygranej(String[][] kolkokrzyzyk, String ox, String who) {

        for (int p = 0; p < kolkokrzyzyk.length; p++) {

            if (kolkokrzyzyk[p][0].equals(ox) && kolkokrzyzyk[p][1].equals(ox) && kolkokrzyzyk[p][2].equals(ox) || kolkokrzyzyk[0][p].equals(ox) && kolkokrzyzyk[1][p].equals(ox) && kolkokrzyzyk[2][p].equals(ox)) {
                System.out.println(who + " WYGRAŁ !!!");
                //break;          //todo powinno przerwać while
                return true;
            }
        }

        if (kolkokrzyzyk[0][0].equals(ox) && kolkokrzyzyk[1][1].equals(ox) && kolkokrzyzyk[2][2].equals(ox) || kolkokrzyzyk[0][2].equals(ox) && kolkokrzyzyk[1][1].equals(ox) && kolkokrzyzyk[2][0].equals(ox)) {
            System.out.println(who + " WYGRAŁ !!!");
            //break;
            return true;
        }
        return false;
    }
}