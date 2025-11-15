import java.util.Random;

public class LinearSearchTest {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == target) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};
        Random rand = new Random();

        System.out.println("Algorithm: Linear Search");
        System.out.println("Input Size | Time (ms)");
        System.out.println("-----------------------");

        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = rand.nextInt(10000);

            int target = arr[rand.nextInt(size)];

            long start = System.nanoTime();
            linearSearch(arr, target);
            long end = System.nanoTime();

            double timeMs = (end - start) / 1_000_000.0;
            System.out.println(size + "        | " + timeMs);
        }
    }
}
