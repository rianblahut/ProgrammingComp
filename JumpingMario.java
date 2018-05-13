package jumpingmario;

import java.util.Scanner;

public class JumpingMario {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            
            int high = 0;
            int low = 0;
            
            int current = sc.nextInt();
            
            for (int j = 1; j < n; j++) {
                int next = sc.nextInt();
                if (next > current) high++;
                else if (next < current) low++;
                
                current = next;
            }
            
            System.out.println("Case " + i + ": " + high + " " + low);
            
        }

    }
}
