import java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
        Scanner ta = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = ta.nextDouble();

        System.out.print("Enter side b: ");
        double b = ta.nextDouble();

        System.out.print("Enter side c: ");
        double c = ta.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of Triangle = " + area);

        ta.close();
    }
}
