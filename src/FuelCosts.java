import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 0, pricePerGallon = 0;
        String trash = "";
        boolean done;
        // Gallons
        done = false;
        do {
            System.out.print("Enter the number of gallons in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);
        // MPG
        done = false;
        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);
        // Price
        done = false;
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);
        double costPer100Miles = (100 / mpg) * pricePerGallon;
        double range = gallons * mpg;
        System.out.printf("Cost to drive 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Range with full tank: %.2f miles%n", range);
    }
}