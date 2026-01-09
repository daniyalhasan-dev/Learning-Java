import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner eo = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = eo.nextInt();

        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        eo.close();
    }
}
