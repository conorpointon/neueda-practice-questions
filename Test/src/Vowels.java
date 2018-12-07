
public class Vowels {

    void run() {
        int vowels = 0;
        String phrase;

        System.out.print("Please input a phrase: ");
        phrase = ScannerIn.sc.nextLine();

        String[] chars = phrase.split("");

        for (String c : chars) {
            if (
                    c.toUpperCase().equals("A") ||
                    c.toUpperCase().equals("E") ||
                    c.toUpperCase().equals("I") ||
                    c.toUpperCase().equals("O") ||
                    c.toUpperCase().equals("U")
            ) {
                vowels++;
            }
        }

        System.out.println("This phrase had " + vowels + " vowels.");
    }
}
