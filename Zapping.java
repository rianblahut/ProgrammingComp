package zapping;

import java.util.Scanner;

public class Zapping {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            
            int a = sc.nextInt() + 1;
            int b = sc.nextInt() + 1;
            
            if (a == 0 && b == 0) break;
            
            if (a < b) {
                int up = b-a;
                int down = Math.abs(0-a) + Math.abs(100-b);
                if (up < down) System.out.println(up);
                else if (down < up) System.out.println(down);
                else System.out.println(50);
            }
            else if (a > b) {
                int down = a - b;
                int up = Math.abs(100-a) + Math.abs(0-b);
                if (up < down) System.out.println(up);
                else if (down < up) System.out.println(down);
                else System.out.println(50);
            }
            else System.out.println(0);
            
        }

    }
}
