import java.util.Scanner;

public class Zad6 {


    public static void main(String[] args) {

        String[][] kolkokrzyzyk = new String[3][3];                         //[wiersze][kolumny]
        Scanner scaner = new Scanner(System.in);

        for (int k = 0; k < kolkokrzyzyk.length; k++) {                      //nadpisywanie
            for (int l = 0; l < kolkokrzyzyk[0].length; l++) {
                kolkokrzyzyk[k][l] = " ";
            }
        }

        int wiersz, kolumna;




        System.out.println("GRA KOLKO KRZYRZYK\n");

        label:
        while (true) {

            System.out.println("Gracz: KOLKO");

            System.out.print("Wprowadz wiersz [1-3]: ");
            wiersz = scaner.nextInt() - 1;
            System.out.print("Wprowadz kolumne [1-3]: ");
            kolumna = scaner.nextInt() - 1;

            if (wiersz < kolkokrzyzyk.length && wiersz >= 0 && kolumna < kolkokrzyzyk[0].length && kolumna >= 0) {
                if (kolkokrzyzyk[wiersz][kolumna].equals(" "))
                    kolkokrzyzyk[wiersz][kolumna] = "O";
            }

            for (int i = 0; i < kolkokrzyzyk.length; i++) {                      //drukowanie  todo pzrobić z drukowania metode
                for (int j = 0; j < kolkokrzyzyk[0].length; j++) {
                    System.out.print("|" + kolkokrzyzyk[i][j] + "|");
                }
                System.out.println("");
            }

            for (int p = 0; p < kolkokrzyzyk.length; p++) {                       //sprawdzanie wygranej

                if (kolkokrzyzyk[p][0].equals("O") && kolkokrzyzyk[p][1].equals("O") && kolkokrzyzyk[p][2].equals("O") || kolkokrzyzyk[0][p].equals("O") && kolkokrzyzyk[1][p].equals("O") && kolkokrzyzyk[2][p].equals("O")) {
                    System.out.println("Kołko WYGRAŁ !!!");
                    break label;          //todo powinno przerwać while
                }
            }

            if (kolkokrzyzyk[0][0].equals("O") && kolkokrzyzyk[1][1].equals("O") && kolkokrzyzyk[2][2].equals("O") || kolkokrzyzyk[0][2].equals("O") && kolkokrzyzyk[1][1].equals("O") && kolkokrzyzyk[2][0].equals("O")) {
                System.out.println("Kołko WYGRAŁ !!!");
                break;
            }





            System.out.println("Gracz: KRZYZYK");

            System.out.print("Wprowadz wiersz [1-3]: ");
            wiersz = scaner.nextInt() - 1;
            System.out.print("Wprowadz kolumne [1-3]: ");
            kolumna = scaner.nextInt() - 1;

            if (wiersz < kolkokrzyzyk.length && wiersz >= 0 && kolumna < kolkokrzyzyk[0].length && kolumna >= 0) {
                if (kolkokrzyzyk[wiersz][kolumna].equals(" "))
                    kolkokrzyzyk[wiersz][kolumna] = "X";
            }

            for (int i = 0; i < kolkokrzyzyk.length; i++) {                      //drukowanie  todo pzrobić z drukowania metode
                for (int j = 0; j < kolkokrzyzyk[0].length; j++) {
                    System.out.print("|" + kolkokrzyzyk[i][j] + "|");
                }
                System.out.println("");
            }

            for (int p = 0; p < kolkokrzyzyk.length; p++) {                       //sprawdzanie wygranej
                if (kolkokrzyzyk[p][0].equals("X") && kolkokrzyzyk[p][1].equals("X") && kolkokrzyzyk[p][2].equals("X") || kolkokrzyzyk[0][p].equals("X") && kolkokrzyzyk[1][p].equals("X") && kolkokrzyzyk[2][p].equals("X")) {
                    System.out.println("Kołko WYGRAŁ !!!");
                    break label;
                }
            }

            if (kolkokrzyzyk[0][0].equals("X") && kolkokrzyzyk[1][1].equals("X") && kolkokrzyzyk[2][2].equals("X") || kolkokrzyzyk[0][2].equals("X") && kolkokrzyzyk[1][1].equals("X") && kolkokrzyzyk[2][0].equals("X")) {
                System.out.println("Kołko WYGRAŁ !!!");
                break;
            }
        }
    }
}