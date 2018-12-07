import java.util.Random;

public class Guess {
    private int random;
    private int attempts;

    void run() {
        random = new Random().nextInt(100) + 1;
        attempts = 0;
        int input = 0;

        System.out.print("Please guess a number from 1 to 100: ");
        input = ScannerIn.sc.nextInt();
        guess(input);

        System.out.println("Congratulations! You guessed correctly.");
        System.out.printf("You took " + attempts + " attempts.");
    }

    void guess(int input) {
        attempts++;
        if(input != random) {
            if(input > random) {
                System.out.println("You guessed too high!");
            }else{
                System.out.println("You guessed too low!");
            }

            System.out.print("Please try again: ");
            input = ScannerIn.sc.nextInt();
            guess(input);
        }
    }
}
