import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] testInput = generateRandomArray(1000, 0, 1000);
        TestSuite.run(testInput, 10);
    }

    public static int[] generateRandomArray(int size, int minValue, int maxValue) {
        Random rand = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt((maxValue - minValue) + 1) + minValue;
        }

        return array;
    }
}
