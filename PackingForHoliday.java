package packingforholiday;

import java.util.Scanner;

public class PackingForHoliday {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 1; i <= t; i++) {
            
            int l = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();

            if (l <= 20 && w <= 20 && h <= 20) {
                System.out.println("Case " + i + ": good");
            }
            else System.out.println("Case " + i + ": bad");
            
        }

    }
}
