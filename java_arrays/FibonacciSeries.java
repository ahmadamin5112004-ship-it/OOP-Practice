package java_arrays;

public class FibonacciSeries {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");


        System.out.print(first + ", " + second);


        for (int i = 1; i <= 10; i++) {
            int next = first + second;
            System.out.print(", " + next);

            first = second;
            second = next;
        }
    }
}