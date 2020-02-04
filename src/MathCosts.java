import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathCosts {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("mathCosts.dat"));
        int n = input.nextInt();
        while (n != 0) {
            PriorityQueue<Integer> numbers = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                numbers.add(input.nextInt());
            }
            int minCost = Integer.MIN_VALUE;
            

            n = input.nextInt();
        }


    }
}
