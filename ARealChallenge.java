package arealchallenge;

/**
 * Practice Contest 2
 */

import java.util.Scanner;

public class ARealChallenge {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long area = sc.nextLong();
        
        double perimeter = Math.sqrt(area) * 4;
        
        if (perimeter == area) System.out.println(area);
        
        else System.out.println(perimeter);

    }
}
