package sumoftheothers;

// Practice contest 9/14
import java.util.Scanner;

public class SumOfTheOthers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            String line = s.nextLine();
            String lineS[] = line.split(" ");
            int lineI[] = new int[lineS.length];
            int sum = 0;
            for (int i = 0; i < lineS.length; i++) {
                lineI[i] = Integer.parseInt(lineS[i]);
                sum += lineI[i];
            }
            sum = sum/2;
            System.out.println(sum);
        }

    }
}
