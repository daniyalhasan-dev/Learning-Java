import java.util.Scanner;

public class Discountedprice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter original selling price: ");
        double original = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = input.nextDouble();

        double discountedPrice = original - (original * discount / 100);

        System.out.println("Discounted Selling Price = " + discountedPrice);

        input.close();
    }
}
