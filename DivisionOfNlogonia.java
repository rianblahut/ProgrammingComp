package divisionofnlogonia;

import java.util.Scanner;
import java.io.*;

class Main {
    
    void init(){
        
        Scanner s = new Scanner(System.in);
        int k = -1;

        k = s.nextInt();

        while (k != 0) {

            int n = s.nextInt();
            int m = s.nextInt();
            for (int i = 0; i < k; i++) {
                int x = s.nextInt();
                int y = s.nextInt();
                if (x == n || y == m) {
                    System.out.println("divisa");
                } else if (x < n && y > m) {
                    System.out.println("NO");
                } else if (x > n && y > m) {
                    System.out.println("NE");
                } else if (x > n && y < m) {
                    System.out.println("SE");
                } else if (x < n && y < m) {
                    System.out.println("SO");
                } else {
                    System.out.println("ERROR");
                }
            }
            k = s.nextInt();
        }
    }

    public static void main(String[] args) throws IOException {
        Main work = new Main();
        work.init();
    }
}
