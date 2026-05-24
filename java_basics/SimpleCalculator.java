package java_basics;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print(
                "Enter operator (+ - * /): ");

        char ch = sc.next().charAt(0);

        if (ch == '+') {
            System.out.println(a + b);
        } else if (ch == '-') {
            System.out.println(a - b);
        } else if (ch == '*') {
            System.out.println(a * b);
        } else if (ch == '/') {
            System.out.println(a / b);
        } else {
            System.out.println(
                    "Invalid Operator");
        }

        sc.close();
    }
}