package parking;

// Practice contest 9/14

import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int max = 0;
            int min = 100;
            for (int j = 0; j < n; j++) {
                int store = s.nextInt();
                if (store < min) min = store;
                if (store > max) max = store;
            }
            int distance = (max - min) * 2;
            System.out.println(distance);
        }

    }
}
