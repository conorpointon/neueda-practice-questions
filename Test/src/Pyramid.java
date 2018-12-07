
public class Pyramid {

    void run() {
        int rows;
        int hash;
        int spaces;

        System.out.print("Please input a number of rows: ");
        rows = ScannerIn.sc.nextInt();
        spaces = rows - 1;
        hash = 1;

        for(int x = 0; x < rows; x++) {
            for(int z = 0; z < spaces; z++) {
                System.out.print(" ");
            }

            for(int y = 0; y < hash; y++) {
                System.out.print("#");
            }

            for(int z = 0; z < spaces; z++) {
                System.out.print(" ");
            }
            spaces -= 1;
            hash += 2;
            System.out.print("\n");
        }
    }
}
