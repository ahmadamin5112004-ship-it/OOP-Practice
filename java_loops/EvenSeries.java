package java_loops;

public class EvenSeries {
    public static void main(String[] args) {
        System.out.println("Even series using for loop:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nEven series using while loop:");
        int j = 2;
        while (j <= 20) {
            System.out.print(j + " ");
            j += 2;
        }

        System.out.println("\nEven series using do-while loop:");
        int k = 2;
        do {
            System.out.print(k + " ");
            k += 2;
        } while (k <= 20);
    }
}