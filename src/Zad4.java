import java.util.Arrays;
import java.util.Random;

public class Zad4 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[6];
        do {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(49) + 1;
            }
        } while (lotto(numbers));

        //Arrays.sort(numbers);
        for (int dsdf : numbers) {
            System.out.print(dsdf + ", ");
        }
    }


    public static boolean lotto(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i!=j){
                    if(numbers[i]==numbers[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}