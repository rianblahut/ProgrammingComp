package cd2;

/**
 * Practice Contest 2
 */
import java.util.Arrays;
import java.util.Scanner;

public class CD2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        while (N != 0 && M != 0) {
            if (N + M == 0) {
                break;
            }
            boolean cdlist[] = new boolean[1000000000];
            //Arrays.fill(cdlist, false);

            for (int i = 0; i < N; i++) {
                int current = sc.nextInt();
                cdlist[current] = true;
            }

            int cds = 0;
            for (int i = 0; i < M; i++) {
                int current = sc.nextInt();
                if (cdlist[current] == true) cds++;
            }
            System.out.println(cds);

            N = sc.nextInt();
            M = sc.nextInt();
        }
    }

}
