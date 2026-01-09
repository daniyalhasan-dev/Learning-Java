import java.util.Scanner;

public class Powercalculation {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);

        System.out.print("Enter voltage (Volts): ");
        double volts = pc.nextDouble();

        System.out.print("Enter current (Amperes): ");
        double amperes = pc.nextDouble();

        double watts = volts * amperes;

        System.out.println("Power Consumption = " + watts + " Watts");

        pc.close();
    }
}
