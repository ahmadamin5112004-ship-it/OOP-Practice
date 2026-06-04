package java_discussion10;

import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = 5;
        int subjects = 5;


        int[] credits = new int[subjects];

        System.out.println("Enter credits for 5 subjects:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Credit for Subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
        }


        double[][] gradePoints = new double[students][subjects];


        System.out.println("\nEnter grade points for each student:");

        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            for (int j = 0; j < subjects; j++) {
                System.out.print("Grade Point for Subject " + (j + 1) + ": ");
                gradePoints[i][j] = sc.nextDouble();
            }
        }


        System.out.println("\n----- CGPA Results -----");

        int totalCredits = 0;
        for (int credit : credits) {
            totalCredits += credit;
        }

        for (int i = 0; i < students; i++) {

            double weightedSum = 0;

            for (int j = 0; j < subjects; j++) {
                weightedSum += gradePoints[i][j] * credits[j];
            }

            double cgpa = weightedSum / totalCredits;

            System.out.printf("Student %d CGPA = %.2f%n",
                    (i + 1), cgpa);
        }

        sc.close();
    }
}
