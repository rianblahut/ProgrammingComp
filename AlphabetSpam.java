package alphabetspam;

/**
 * Practice Contest 2
 */

import java.util.Scanner;

public class AlphabetSpam {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int w = 0;
        int l = 0;
        int u = 0;
        int s = 0;
        
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '_') w++;
            else if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') l++;
            else if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') u++;
            else s++;
        }
        double total = w + l + u + s;
        System.out.println(w/total);
        System.out.println(l/total);
        System.out.println(u/total);
        System.out.println(s/total);

    }
}
