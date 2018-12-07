
public class SumN {

    void run() {
        String input;
        int total = 0;

        System.out.print("Please input a number: ");
        input = ScannerIn.sc.next();

        int validInput = validate(input);

        System.out.println("This number is valid: " + validInput);

        for (int x = 1; x <= validInput; x++) {
            total += x;
            System.out.println(total);
        }
    }

    int validate(String input){
        try {
            return Integer.parseInt(input);
        }catch (NumberFormatException e){
            System.out.print("Please input a valid number: ");
            return validate(ScannerIn.sc.next());
        }
    }
}
