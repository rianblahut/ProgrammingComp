package costcutting;

import java.util.Scanner;

public class CostCutting {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        
        for (int i = 1; i <= t; i++) {
            int s1 = s.nextInt();
            int s2 = s.nextInt();
            int s3 = s.nextInt();
            
            System.out.print("Case " + i + ": ");
            
            int survivor;
            if (s1 < s2 && s2 < s3) System.out.println(s2);
            else if (s3 < s2 && s2 < s1) System.out.println(s2);
            else if (s1 < s3 && s3 < s2) System.out.println(s3);
            else if (s2 < s3 && s3 < s1) System.out.println(s3);
            else if (s2 < s1 && s1 < s3) System.out.println(s1);
            else if (s3 < s1 && s1 < s2) System.out.println(s1);
            
        }

    }
}
