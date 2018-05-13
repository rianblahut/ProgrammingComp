package googlelucky;

import java.util.Scanner;

public class GoogleLucky {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= t; i++) {
            System.out.println("Case #" + i + ":");

            int top = 0;

            String[] sites = new String[10];
            int[] rankings = new int[10];
            for (int j = 0; j < 10; j++) {

                String line = sc.nextLine();
                String[] line2 = line.split(" ");
                sites[j] = line2[0];

                int rank = Integer.parseInt(line2[1]);
                rankings[j] = rank;
                if (rank > top) {
                    top = rank;
                }
            }
            for (int j = 0; j < 10; j++) {
                if (rankings[j] == top) {
                    System.out.println(sites[j]);
                }
            }

        }

    }
}
