package adifferentproblem;

/**
 * Programming Contest 9/14
 */

import java.util.Scanner;

public class ADifferentProblem {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        while (s.hasNext()) {
            long a = s.nextLong();
            long b = s.nextLong();
            long diff = Math.abs(a-b);
            System.out.println(diff);
        }

    }
}
