package texquotes;

import java.util.Scanner;

public class TEXQuotes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int changes = 0;
        String l = sc.nextLine();

        while (true) {
            
            

            String o = "";

            for (int i = 0; i < (l.length()); i++) {
                char c = l.charAt(i);
                if (c == '"' && changes % 2 == 0) {
                    o += "``";
                    changes++;
                } else if (c == '"' && changes % 2 != 0) {
                    o += "''";
                    changes++;
                } else {
                    o += c;
                }
            }
            System.out.println(o);
            try {
                l = sc.nextLine();
                if (l.equals("")) break;
            }
            catch (Exception e) {
                System.exit(0);
            }

        }

    }
}
