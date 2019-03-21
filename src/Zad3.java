import java.util.Random;

public class Zad3 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] wyniki = new int[1000];

        for (int i = 0; i < 1000; i++) {
            wyniki[i] = random.nextInt(6) + 1;
        }
        int jeden, dwa, trzy, cztery, piec, szesc;
        jeden = 0;                                  //todo dlaczego muszę przypisywać zero?
        dwa = 0;
        trzy = 0;
        cztery = 0;
        piec = 0;
        szesc = 0;

        for (int j = 0; j < wyniki.length; j++) {

            switch (wyniki[j]) {
                case 1:
                    jeden++;
                    break;
                case 2:
                    dwa++;
                    break;
                case 3:
                    trzy++;
                    break;
                case 4:
                    cztery++;
                    break;
                case 5:
                    piec++;
                    break;
                case 6:
                    szesc++;
                    break;
            }
        }
        System.out.println("1. " + jeden);
        System.out.println("2. " + dwa);
        System.out.println("3. " + trzy);
        System.out.println("4. " + cztery);
        System.out.println("5. " + piec);
        System.out.println("6. " + szesc);
    }
}