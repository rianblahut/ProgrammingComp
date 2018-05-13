package polyhedra;

import java.util.Scanner;

public class Polyhedra {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        
        for (int i = 0; i < t; i++) {
            int v = s.nextInt();
            int e = s.nextInt();
            int f = 2-v+e;
            System.out.println(f);
        }

    }
}
