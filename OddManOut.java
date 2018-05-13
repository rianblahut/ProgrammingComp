package oddmanout;

/**
 * Practice Contest 2
 */

import java.util.Scanner;

public class OddManOut {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            int G = sc.nextInt();
            long guestList[] = new long[G];
            
            for (int j = 0; j < G; j++) {
                long current = sc.nextInt();
                guestList[j] = current;
            }
            for (int k = 0; k < G; k++) {
                for (int l = 0; l < G; l++) {
                    if (k != l) {
                        if (guestList[k] == guestList[l]) {
                            guestList[k] = 0;
                            guestList[l] = 0;
                        }
                    }
                }
            }
            long c = 0;
            for (int m = 0; m < G; m++) {
                c += guestList[m];
            }
            System.out.println("Case #" + i + ": " + c);
        }

    }
}
