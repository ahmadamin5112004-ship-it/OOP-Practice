package java_arrays;


import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

     
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

  
        int greatest = arr[0];


        for (int i = 1; i < n; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }

        System.out.println("Greatest number = " + greatest);
    }
}