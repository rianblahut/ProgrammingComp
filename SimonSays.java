package simonsays;

import java.util.Scanner;

public class SimonSays {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int number = s.nextInt();
        
        for (int i = 0; i <= number; i++) {
            String line = s.nextLine();
            if (line.startsWith("Simon says")) {
                System.out.println(line.substring(11));
            }
        }

    }
}
