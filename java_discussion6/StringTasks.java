package java_discussion6;

import java.util.Scanner;

public class StringTasks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. Reverse the string
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);

        // 2. Check palindrome
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        // 3. Count occurrence of a character
        System.out.print("Enter character to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Occurrence of '" + ch + "' = " + count);

        sc.close();
    }
}
