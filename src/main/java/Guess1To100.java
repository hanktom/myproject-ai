import java.util.Random;
import java.util.Scanner;

public class Guess1To100 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        boolean win = false;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a numer between " + min + " to " + max);
            String s = scanner.next();
            int n = Integer.parseInt(s);
            if (n > secret) {
                max = n;
            } else {
                if (n < secret) {
                    min = n;
                } else {
                    win = true;
                    break;
                }
            }
        }
        if (win) {
            System.out.println("You win!");
        } else {
            System.out.println("You loose!");
        }

    }
}
