import java.util.ArrayList;
import java.util.Collections;

public class Sort {

    void run() {
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("This is a program that will take 7 input nums and find the smallest and largest.");

        for(int x = 1; x < 8; x++) {
            System.out.print("Please input number " + x + ": ");
            arr.add(ScannerIn.sc.nextInt());
        }

        Collections.sort(arr);

        System.out.println(arr);

        System.out.println("Smallest number: " + arr.get(0));
        System.out.println("Largest number: " + arr.get(arr.size() - 1));
    }
}
