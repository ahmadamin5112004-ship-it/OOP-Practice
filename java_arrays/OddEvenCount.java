package java_arrays;

import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int oddCount = 0;
        int evenCount = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

        
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count = " + evenCount);
        System.out.println("Odd numbers count = " + oddCount);
    }
}
