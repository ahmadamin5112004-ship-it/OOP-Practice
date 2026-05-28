package java_loops;

public class OddSeries {
    public static void main(String[] args) {
        System.out.println("Odd series using for loop:");
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nOdd series using while loop:");
        int j = 1;
        while (j <= 19) {
            System.out.print(j + " ");
            j += 2;
        }

        System.out.println("\nOdd series using do-while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k += 2;
        } while (k <= 19);
    }
}