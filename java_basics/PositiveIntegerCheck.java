package java_basics;
import java.util.Scanner;

public class PositiveIntegerCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(
                    "Positive Integer");
        } else {
            System.out.println(
                    "Not Positive Integer");
        }

        sc.close();
    }
}