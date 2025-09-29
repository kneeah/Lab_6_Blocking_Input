import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int secret = gen.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Number must be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);
        System.out.println("The secret number was: " + secret);
        if (guess < secret) {
            System.out.println("Your guess was too low.");
        } else if (guess > secret) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("You got it! On the money!");
        }
    }
}