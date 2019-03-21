import java.util.Random;

public class Zad5 {

    //Napisz program, który stworzy macierz (tablicę) 5x5 wypełnionymi losowymi
    //wartościami całkowitymi z zakresu {-5, …, 5}.
    //Dla każdego wiersza wyznacz minimum i maksimum.

    public static void main(String[] args) {

        int[][] macierz = new int[5][5];   //[wiersze][kolumny]
        Random random = new Random();

        for (int i = 0; i < macierz.length; i++) {                      //tworzenie
            for (int j = 0; j < macierz[0].length; j++) {
                macierz[i][j] = random.nextInt(11) - 5;
            }
        }


        for (int i = 0; i < macierz.length; i++) {                      //drukowanie
            for (int j = 0; j < macierz[0].length; j++) {
                if (macierz[i][j] >= 0) {
                    System.out.print(" " + macierz[i][j] + ", ");
                    continue;
                }
                System.out.print(macierz[i][j] + ", ");
            }
            System.out.println();
        }


        int[] najm = new int[macierz.length];                           //minimalne i maksymalne
        int[] najw = new int[macierz.length];

        for (int i = 0; i < macierz.length; i++) {
            najm[i] = macierz[i][0];
            najw[i] = macierz[i][0];

            for (int j = 1; j < macierz[0].length; j++) {

                if (macierz[i][j] < najm[i]) {
                    najm[i] = macierz[i][j];
                }
                if (macierz[i][j] > najw[i]) {
                    najw[i] = macierz[i][j];
                }
            }
        }

        System.out.print("\nMinimalne wartości dla wiersza: ");
        for (int i = 0; i < najm.length; i++) {
            System.out.print(najm[i] + ", ");
        }
        System.out.print("\nMaksymalne wartości dla wiersza: ");
        for (int i = 0; i < najm.length; i++) {
            System.out.print(najw[i] + ", ");
        }
    }
}