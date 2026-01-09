import java.util.Scanner;

public class Trapezoidarea {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);

        System.out.print("Enter length of first parallel side (a): ");
        double a = ta.nextDouble();

        System.out.print("Enter length of second parallel side (b): ");
        double b = ta.nextDouble();

        System.out.print("Enter height (h): ");
        double h = ta.nextDouble();

        double area = h * (a + b) / 2;

        System.out.println("Area of Trapezoid = " + area);

        ta.close();
    }
}
