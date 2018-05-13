package linethemup;

/**
 * Programming contest from 9/14
 */
import java.util.Scanner;

public class LineThemUp {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        boolean increasing = true;
        boolean decreasing = true;

        s.nextLine();
        String prevName = s.nextLine();
        //System.out.println("Prev: " + prevName);

        for (int i = 1; i < n; i++) {
            String currentName = s.nextLine();
            //System.out.println("Current: " + currentName);
            if (prevName.compareTo(currentName) < 0) {
                decreasing = false;
                //System.out.println(prevName + " < " + currentName);
            } else if (prevName.compareTo(currentName) > 0) {
                increasing = false;
                //System.out.println(prevName + " > " + currentName);
            } else if (prevName.compareTo(currentName) == 0) {
                //System.out.println("SAME NAME");
            }
            prevName = currentName;
        }

        if (increasing == true && decreasing == false) {
            System.out.println("INCREASING");
        } else if (increasing == false && decreasing == true) {
            System.out.println("DECREASING");
        } else if (increasing == false && decreasing == false) {
            System.out.println("NEITHER");
        } else {
            System.out.println("ERROR");
        }

    }
}
