
public class Fibonacci {

    void run() {
        int x = 1;
        int y = 1;
        int temp;

        System.out.println(x +"\n"+y);

        for(int z = 0; z < 10; z++) {
            System.out.println(x + y);
            temp = x + y;
            x = y;
            y = temp;
        }
    }
}
