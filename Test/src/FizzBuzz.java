
public class FizzBuzz {

    void run() {
        for (int x = 1; x < 1001; x++) {
            if(x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz: " + x);
                continue;
            }

            if(x % 3 == 0) {
                System.out.println("Fizz: " + x);
                continue;
            }

            if(x % 5 == 0) {
                System.out.println("Buzz: " + x);
                continue;
            }

            System.out.println(x);
        }
    }
}
