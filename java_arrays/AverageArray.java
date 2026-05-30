package java_arrays;
import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        double sum = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

   
        double average = sum / n;

        System.out.println("Average = " + average);
    }
}