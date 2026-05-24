package java_basics;
import java.util.Scanner;

public class PracticeProblem01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Triangle area
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("Triangle Area = " + triangleArea);

        // Sphere volume
        System.out.print("Enter radius for sphere: ");
        double radius1 = sc.nextDouble();
        double sphereVolume =
                (4.0 / 3.0) * Math.PI * Math.pow(radius1, 3);
        System.out.println("Sphere Volume = " + sphereVolume);

        // Circle area
        System.out.print("Enter radius for circle: ");
        double radius2 = sc.nextDouble();
        double circleArea = Math.PI * Math.pow(radius2, 2);
        System.out.println("Circle Area = " + circleArea);

        // Celsius to Fahrenheit
        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit =
                (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + fahrenheit);

        // Equilateral triangle
        System.out.print("Enter arm: ");
        double arm = sc.nextDouble();
        double equilateralArea =
                (Math.sqrt(3) / 4) * Math.pow(arm, 2);
        System.out.println(
                "Equilateral Triangle Area = "
                        + equilateralArea);

        // Heron's Formula
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2.0;

        double heronArea =
                Math.sqrt(
                        s * (s - a) * (s - b) * (s - c));

        System.out.println(
                "Triangle Area (Heron) = "
                        + heronArea);

        sc.close();
    }
}