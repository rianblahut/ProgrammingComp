package horrordash;

import java.util.Scanner;

public class HorrorDash {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int testCases = s.nextInt();
        s.nextLine();

        for (int i = 1; i <= testCases; i++) {
            int fastest = 0;
            String line = s.nextLine();
            String[] stringArray = line.split(" ");
            int[] intArray = new int[stringArray.length];
            for (int a = 0; a < intArray.length; a++) {
                intArray[a] = Integer.parseInt(stringArray[a]);
            }

            for (int j = 0; j < intArray.length; j++) {
                if (intArray[j] > fastest) {
                    fastest = intArray[j];
                }
            }
            System.out.println("Case " + i + ": " + fastest);

        }

    }
}
