public class Zad1 {

    public static void main(String[] args) {

        String[] litery = new String[]{"p", "r", "o", "g", "r", "a", "m", "o", "w", "a", "n", "i", "e"};

        System.out.println("_________A");   //pionowo
        for (String asd : litery) {
            System.out.println(asd);
        }

        System.out.println("_________B");   //poziomo z odstępami
        for (int i = 0; i < litery.length; i++) {
            System.out.print(litery[i] + " ");
        }

        System.out.println("\n_________C");   //zamiana pierwszej litery na wielką - .toUpperCase()
        for (int i = 0; i < litery.length; i++) {
            if (i == 0) {
                System.out.print(litery[i].toUpperCase());
            } else
                System.out.print(litery[i]);
        }

        System.out.println("\n_________D");   //zamiana wszystkich liter na wielkie
        for (int i = 0; i < litery.length; i++) {
            System.out.print(litery[i].toUpperCase());
        }

        System.out.println("\n_________E");   //znaki zawarte w tablicy w kolejności odwrotnej
        for (int i = litery.length - 1; i >= 0; i--) {
            System.out.print(litery[i]);
        }

        System.out.println("\n_________F");   //zamienić wszystkie „o” na „0” i „e” na „3” z wykorzystaniem metody .replaceAll(oldChar, newChar)
        for (String asd : litery)
            System.out.print(asd.replace("o", "0").replace("e", "3"));
    }
}