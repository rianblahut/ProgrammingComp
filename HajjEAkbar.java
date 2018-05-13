package hajjeakbar;

import java.util.Scanner;

public class HajjEAkbar {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int i = 1;
        boolean isDone = false;
        while (!isDone) {

            String word = s.nextLine();
            if (word.equals("*")) {
                isDone = true;
            }

            if (word.equals("Hajj")) {
                System.out.println("Case " + i++ + ": Hajj-e-Akbar");
            } else if (word.equals("Umrah")) {
                System.out.println("Case " + i++ + ": Hajj-e-Asghar");
            }

        }

    }
}
