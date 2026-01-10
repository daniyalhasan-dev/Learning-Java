import java.util.Scanner;

public class Percentagemarks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Obtained Marks: ");
        double om = input.nextDouble();

        System.out.print("Enter Maximum Marks: ");
        double mm = input.nextDouble();

        if (om > mm) {
            System.out.print("Enter marks can't be greater than maximum marks!: ");
        }

        if (mm == 0) {
            System.out.println("Maximum marks cannot be zero.");
        } else {
            double percentage = (om / mm) * 100;
            System.out.println("Percentage: " + percentage + "%");
        }

        input.close();
    }
}
