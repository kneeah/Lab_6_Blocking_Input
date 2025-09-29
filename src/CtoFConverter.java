import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said: " + trash);
                System.out.println("You must enter a valid number!");
            }
        } while (!done);
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);
    }
}