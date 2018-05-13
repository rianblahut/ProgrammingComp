package cd;

/**
 * Practice Contest 2
 */
import java.util.Scanner;

public class CD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        while (N != 0 && M != 0) {
            if (N + M == 0) break;
            long jack[] = new long[N];
            long jill[] = new long[M];

            //System.out.println("Jack's Collection:");
            for (int i = 0; i < N; i++) {
                jack[i] = sc.nextLong();
                //System.out.println(jack[i]);
            }
            //System.out.println("Jill's Collection:");
            for (int i = 0; i < M; i++) {
                jill[i] = sc.nextLong();
                //System.out.println(jill[i]);
            }

            int cds = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    //System.out.print(jack[i] + " match " + jill[j] + " ?");
                    if (jack[i] == jill[j]) {
                        //System.out.println(" Yes!");
                        cds++;
                        break;
                    } else {
                        //System.out.println(" No.");
                    }
                }
            }
            System.out.println(cds);

            N = sc.nextInt();
            M = sc.nextInt();
        }
    }
}
