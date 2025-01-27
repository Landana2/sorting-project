import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] testInput = generateRandomArray(100, 1000);

        TestSuite.run(testInput, 1);
    }

    public static int[] generateRandomArray(int size, int maxValue) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(maxValue);
        }
        return array;
    }
}
